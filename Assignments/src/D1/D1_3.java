package D1;

import java.util.Scanner;

public class D1_3 {
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc=new Scanner(System.in);
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();
		double greatest=(n1<n2?n2:n1);
		System.out.println("The number "+greatest+" is greatest");
	}

}
