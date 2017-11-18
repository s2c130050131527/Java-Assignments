package com.cdac.acts.customer;

import java.io.File;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.cdac.acts.io.utils.DataReader.*;
import static com.cdac.acts.io.utils.DataWriter.*;
import static com.cdac.acts.utils.PopulateList.populate;
public class TesterForIo {

	
	
	
	public static void main(String[] args) {
	
		try(Scanner sc= new Scanner(System.in)){
			boolean fflag=false;
			List<Customer> list=null;
			System.out.println("Enter File Name:");
			String fileName=sc.next();
			File file=new File(fileName);
			if(file.exists()&&file.isFile()) {
				fflag=true;
			}
			boolean flag = true;
			while(flag) {
				if(fflag) {
					list=readData(fileName);
					System.out.println(list);
				}
				else {
					list=new ArrayList<>();
					fflag=true;
				}
				int ch=0;
				ch=choose();
				switch (ch) {
				case 1:
					System.out.println("Enter Cust Details");
					Customer c=new Customer(sc.next(),sc.nextDouble(),sc.next(),sc.next(),sc.next());
					writeCustData(c, fileName);
			
					
					
					System.out.println("Data Written Successfully");
					break;
				case 99:
					flag=false;
					break;
				default:
					System.out.println("Invalid choice");
					break;
				}
				
			}
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static int choose() {
		int ch;
		Scanner sc=new Scanner(System.in);
	
			System.out.println("1.Write a custome");
			System.out.println("99.exit");
			ch=sc.nextInt();
		
		return ch;
	}
}
