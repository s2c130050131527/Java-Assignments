package com.cdac.acts.customer;

import java.util.Scanner;

import com.cdac.acts.cust_exceptions.CustomerException;
import com.cdac.acts.utils.ValidationUtil;

import java.util.ArrayList;
import java.util.Iterator.*;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer> al=new ArrayList<>();
		int count = 0;
		//Customer[] c1 = new Customer[2];
		boolean flag = true;
		int ch;
		String email, name, date, password;
		double amount;

		Scanner sc = new Scanner(System.in);
		ValidationUtil valid = new ValidationUtil();
		// Customer c1=new Customer("neha@gmail.com", 4500.0, "hng$k", "12-03-2017",
		// "Neha Patidar");
		// Customer c2=new Customer("neha@gmail.com", 6500.0, "khgs$g", "17-07-2017",
		// "Kalicharan");
		/*
		 * try { valid.validateAmount(500.0); //valid.validateDate("03-02-2018");
		 * //valid.validateMail("neha@gmail.com"); //valid.validatePassword("nehjjga#");
		 * boolean flag=c1.equals(c2); System.out.println(flag); } catch
		 * (CustomException e) { // TODO Auto-generated catch block e.printStackTrace();
		 * }
		 */

		try {
			while (flag) {

				System.out.println("-----------------------------------------");
				System.out.println("1.Enter customer ");
				System.out.println("2.Display details");
				System.out.println("3.Check if Equals");
				System.out.println("4.Exit");
				System.out.println("Your choice : ");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					
					System.out.println("Enter E-mail : ");
					email = sc.next();
					// valid.validateMail(email);
					System.out.println("Enter Password : ");
					password = sc.next();
					// valid.validatePassword(password);
					System.out.print("Enter Amount : ");
					amount = sc.nextDouble();
					// valid.validateAmount(amount);
					System.out.print("Enter registration date (dd-mm-yyyy) : ");
					date = sc.next();
					// valid.validateDate(date);
					System.out.print("Enter Name : ");
					name = sc.next();
					try {
						valid.validateMail(email);
						valid.validatePassword(password);
						valid.validateAmount(amount);
						valid.validateDate(date);
						//c1[count++] = new Customer(email, amount, password, date, name);
						System.out.println("Customer entry Successful");

					} catch (CustomerException e) {
						e.printStackTrace();
					}
					break;
				case 2:
					//System.out.println(c1[0]);
					break;
				case 3:
					//System.out.println(c1[0].equals(c1[1]));
					break;
				case 4:
					flag = false;
					break;
				default:
					System.out.println("Illegal choice");
				}

			}

		}

		finally {
			sc.close();
		}

	}
}
