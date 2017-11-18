package D1;


public class D1_1 {
	public static void main(String args[]){
		
		if(args.length<2){
			System.out.println("Pass 2 arguments");
			System.exit(1);
		}
		else{

			double n1=Double.parseDouble(args[0]);
			double n2=Double.parseDouble(args[1]);
			double avg=(n1+n2)/2;
			System.out.println("Average is "+avg);
		}
		
	}
}
