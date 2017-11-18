package D1;

import java.util.Scanner;

public class D1_2 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double extra1=0,extra2=0;

		System.out.println("Pass 2 arguments");
		System.out.println("Enter arguents : ");
		if(sc.hasNextDouble())
		{
			extra1=sc.nextDouble();
		}
		else {
			System.out.println("Enter the Integer only!!!");
			System.exit(1);
		}
		if(sc.hasNextDouble())
		{
			extra2=sc.nextDouble();
		}
		else
		{
			System.out.println("Enter the Integer only!!!");
			System.exit(1);
		}
		double avg1=(extra2+extra1)/2;
		System.out.println("Average is "+avg1);


	}

}
