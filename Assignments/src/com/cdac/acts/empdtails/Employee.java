package com.cdac.acts.empdtails;

import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	
	public void getDetails() {
		Scanner sc=new Scanner(System.in); 
		System.out.print("Id:");
		this.id=sc.nextInt();
		System.out.println("Name:");
		this.name=sc.next();
		sc.close();
		
		
	}
	
	
	public String toString() {
		return "id:"+id+","+"name:"+name;
	}
	
}
