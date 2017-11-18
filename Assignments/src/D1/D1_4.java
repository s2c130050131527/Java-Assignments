package D1;

import java.util.Scanner;



public class D1_4 {
	
	public static void main(String[] args) {
		D1_4 d;
		int ch=1;
		Scanner sc=new Scanner(System.in);
		String items[]= {"Samosa","Dosa","Idli","Vada Pav","Misal Pav","Lolipop","Biryani","Sholapuri"};
		double[] price= {12,30,25,25,30,120,110,270};
		int[] qty = new int[8];
		do {
			
			for(int i=0;i<items.length;i++)
			{
				System.out.println((i+1)+" : "+items[i]);
			}
			System.out.println("0 : Generate Bill");
			System.out.println("Enter your Choice: ");
			ch=sc.nextInt();
			if(ch==0||ch>8)
				continue;
			System.out.println("Enter Quantity: ");
			qty[ch-1]+=sc.nextInt();
		}while(ch!=0);
		double sum=0;
		for(int i=0;i<qty.length;i++) {
			sum+=qty[i]*price[i];
		}
		double cgst=sum*0.09;
		double sgst=sum*0.09;
		double gtotal=sum+cgst+sgst;
		System.out.println("Your Bill is : Rs. "+sum+" /- only");
		System.out.println("     cgst(9%): Rs. "+cgst+" /-");
		System.out.println("     sgst(9%): Rs. "+sgst+" /-");
		System.out.println("Total Bill is: Rs. "+gtotal+"/- only");
	
	}
	

}
