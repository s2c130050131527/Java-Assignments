package com.cdac.acts.customer;

import java.util.Scanner;
import static com.cdac.acts.utils.PopulateList.*;
import com.cdac.acts.cust_exceptions.CustomerException;
import com.cdac.acts.utils.ValidationUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Tester2 {
	public static void main(String[] args) {
		int ch;
		boolean flag=true;		
		Map<Customer,Customer> custMap=null;//new HashMap<String,Customer>();
		Scanner sc=new Scanner(System.in);
			while (flag) {
				System.out.println("-----------------------------------------");
				System.out.println("1.Enter customer ");
				System.out.println("2.Display details");
				System.out.println("3.Check if Customer exists");
				System.out.println("4.Display particular");
				System.out.println("5.Update Password and registration amount");
				System.out.println("6.Remove Customer");
				System.out.println("7.Sort by email");
				System.out.println("8.Sort by Amount");
				System.out.println("Your choice : ");
				ch=sc.nextInt();
				try{
					switch (ch) {
					case 1:
						custMap=populate();
						System.out.println(custMap);
						break;
					case 2:
//						display(custMap);
//						break;
//					case 3:
//						checkCustomer(custMap);
//						break;
//					case 4:
//						displayParticular(custMap);
//						break;
//					case 5:
//						update(custMap);						
//						break;
//					case 6:
//						removeCust(custMap);						
//						break;
					case 8:
						Collection<Customer> coll=custMap.values();
						ArrayList<Customer> al=new ArrayList<>(coll);
						Collections.sort(al, new Comparator<Customer>() {

							@Override
							public int compare(Customer o1, Customer o2) {
								return ((Double)o1.getAmount()).compareTo(o2.getAmount());
							}
							
						});
						System.out.println(al);
						break;
					case 7:
						coll=custMap.values();
						al=new ArrayList<>(coll);
						Collections.sort(al,new Comparator<Customer>() {

							@Override
							public int compare(Customer o1, Customer o2) {								
								return (o1.getEmail()).compareTo(o2.getEmail());
							}
							
						});
						System.out.println(al);
						break;
					default:
						System.out.println("Illegal choice");
					}	
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
	}


	private static void removeCust(Map<String, Customer> custMap)throws CustomerException {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter email : ");
		String remail=sc.next();
		Customer emailRemoved=custMap.remove(remail);
		if(emailRemoved!=null) {
			System.out.println("Email successfully removed");
			System.out.println(emailRemoved);
		}
		else
		{
			//sc.close();
			throw new CustomerException("Email does not exists");
		}
		//sc.close();
	}

	private static void update(Map<String, Customer> custMap)throws CustomerException {
		Scanner sc=new Scanner(System.in);
		ValidationUtil valid = new ValidationUtil();
		Customer c1=null;
		System.out.print("Enter email : ");
		String mail=sc.next();
		if(custMap.containsKey(mail)) {
			c1=custMap.get(mail);
			System.out.println("Enter old password: ");
			String old=sc.next();
			if(old.equals(c1.getPassword())) {
				System.out.println("Enter new password and reg amopunt : ");
				String npass=sc.next();
				if(valid.validatePassword(npass)) {
					c1.setPassword(npass);
				}
				else {
					//sc.close();
					throw new CustomerException("Password not in format");
				}
				Double namount=sc.nextDouble();
				if(valid.validateAmount(namount)) {
					c1.setAmount(namount);
				}
				else {
					//sc.close();
					throw new CustomerException("Amount should be in multiple of 500");
				}
			}
			else {
				//sc.close();
				throw new CustomerException("Password mismatch exception");
			}
		}
		else
		{
			//sc.close();
			throw new CustomerException("Email does not exists");
		}
		//sc.close();
	}

	private static void displayParticular(Map<String, Customer> custMap)throws CustomerException {		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter email : ");
		String mail=sc.next();
		Customer inde=custMap.get(mail);
		if(inde!=null) {
			System.out.println("found");
			System.out.println(inde);
		}
		else
		{
			//sc.close();
			throw new CustomerException("Email does not exists");
		}
		//sc.close();
	}

	private static void checkCustomer(Map<String, Customer> custMap)throws CustomerException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email : ");
		Customer csm=new Customer(sc.next());
		if(custMap.containsValue(csm)) {
			System.out.println("The customer already exists.");
		}
		else {
			//sc.close();
			throw new CustomerException("Email does not exists");
		}
		////sc.close();
	}

	private static void display(Map<String, Customer> custMap) {
		System.out.println(custMap);
		System.out.println("ForEach");
		for(Customer c: custMap.values()) {
			System.out.println(c);
		}
		Iterator<Customer> it=custMap.values().iterator();
		System.out.println("Iterator");
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
	}
}
