package com.cdac.acts.stack;

import java.util.Scanner;

import com.cdac.acts.empdtails.Employee;

public class TesterMain {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);

		int ch;
		System.out.println("1.Fixed Stack");
		System.out.println("2.Growable Stack");

		ch=sc.nextInt();


		switch (ch) {
		case 1:	
			fixedstack();
			break;
		case 2:
			growablestack();
			break;
		default:
			System.out.println("Invalid Choice");
		}

		sc.close();
	}

	private static void growablestack() {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc1 =new Scanner(System.in);
		GrowableStack gs= new GrowableStack(2);
		while(true) {
			
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("4.exit");

			ch=sc1.nextInt();


			switch (ch) {
			case 1:	
				Employee e= new Employee();
				e.getDetails();
				gs.push(e);
				break;
			case 2:
				System.out.println(gs.pop());
				break;
			case 3:
				System.out.println(gs);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
			}

			
		}	
	}

	private static void fixedstack() {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int ch = 0;
		FixedStack gs= new FixedStack(2);
		boolean flag = false;
		while(true) {
			
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("4.exit");
			System.out.println("Enter choice");
			ch=sc.nextInt();


			switch (ch) {
			case 1:	
				Employee e= new Employee();
				e.getDetails();
				gs.push(e);
				break;
			case 2:
				System.out.println(gs.pop());
				break;
			case 3:
				System.out.println(gs);
				break;
			case 4:
				flag=true;
				break;
			default:
				System.out.println("Invalid Choice");
			}
			
			
		}
	}



}
