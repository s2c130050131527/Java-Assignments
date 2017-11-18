package com.cdac.acts.customer;
import java.util.Scanner;
import static com.cdac.acts.utils.PopulateList.*;
import com.cdac.acts.cust_exceptions.CustomerException;
import com.cdac.acts.utils.SortUtility;
import com.cdac.acts.utils.ValidationUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Tester {
	public static void main(String[] args) {			
			switcher();
	}
	
	private static void switcher() {
		List<Customer> custList=new ArrayList<>();
		boolean flag=true;
		while (flag) {
			int ch=chooser();
			try {
				switch (ch) {
				case 1:
					custList=populate();					
					break;
				case 2:
					display(custList);
					break;
				case 3:
					ifExists(custList);					
					break;
				case 4:
					displayParticular(custList);					
					break;
				case 5:
					update(custList);					
					break;
				case 6:
					removeCust(custList);
					break;
				case 8:
					Collections.sort(custList,new SortUtility());
					System.out.println(custList);
					break;
				case 7:
					Collections.sort(custList);
					System.out.println(custList);
					break;
				default:
					System.out.println("Illegal choice");
				}
			}catch(CustomerException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static void ifExists(List<Customer> custList) throws CustomerException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email : ");
		Customer csm=new Customer(sc.next());
		if(custList.contains(csm)) {
			System.out.println("The customer already exists.");
		}
		else {
			//sc.close();
			throw new CustomerException("Email does not exists");
		}
		//sc.close();
	}

	private static void displayParticular(List<Customer> custList) throws CustomerException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter email : ");
		String mail=sc.next();
		Customer cs=new Customer(mail);
		int inde=custList.indexOf(cs);
		System.out.println(inde);
		if(custList.contains(cs)) {
			System.out.println("found");
		}
		else
		{
			//sc.close();
			throw new CustomerException("Email does not exists");
		}
		//sc.close();
	}

	private static void display(List<Customer> custList) {
		System.out.println(custList);
		System.out.println("ForEach");
		for(Customer c: custList) {
			System.out.println(c);
		}
		Iterator<Customer> it=custList.iterator();
		System.out.println("Iterator");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private static void update(List<Customer> custList) throws CustomerException {
		ValidationUtil valid = new ValidationUtil();
		Scanner sc = new Scanner(System.in);
		Customer c1=null;
		System.out.print("Enter email : ");
		Customer cs2=new Customer(sc.next());
		if(custList.contains(cs2)) {
			System.out.println("Enter old password: ");
			c1=custList.get(custList.indexOf(cs2));
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
				c1.setAmount(sc.nextDouble());
			}
			else {
				//sc.close();
				throw new CustomerException("Password mismatch exception");
			}
		}
		else
		{//sc.close();
			throw new CustomerException("Email does not exists");
		}
		//sc.close();
	}

	private static void removeCust(List<Customer> custList) throws CustomerException {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter email : ");
		Customer cs1=new Customer(sc.next());
		if(custList.contains(cs1)) {
			custList.remove(cs1);
		}
		else
		{
			//sc.close();
			throw new CustomerException("Email does not exists");
		}
		//sc.close();
	}

	private static int chooser() {
		Scanner sc=new Scanner(System.in);
		int ch;
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
		ch = sc.nextInt();
		//sc.close();
		return ch;
	}
}
