package D2;

public class Student {
	private int id;
	private String name;
	private String email;
	private int age;
	private double gpa;
	private int quiz;
	private int test;
	private int assign;
	
	
	Student(){
	}
	
	Student(int i,String n,String e,int a){
		this.id=i;
		this.name=n;
		this.email=e;
		this.age=a;
	}
	
	public String fetchData() {
		return "Id: "+this.id+" Name: "+this.name+" Email: "+this.email+" Age: "+this.age+" GPA: "+this.gpa;
	}
	
	public void display() {
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Email: "+this.email);
		System.out.println("Age: "+this.age);
		System.out.println("GPA: "+this.gpa);
	    }
    }
 	class Tester{
	 public static void main(String[] args) {
	
		 int[] a = new int[] {1,2,3};
		 
		 
		 Student[] stud={new Student(101,"Narendra","narendrasahukrb@gmail.com",23),new Student(102,"Shrey","shreyngd@gmail.com",24)};//new Student[2];
		 //stud=new Student(Student(101,"Narendra","narendrasahukrb@gmail.com",23),Student(102,"Shrey","shreyngd@gmail.com",24));
		 //stud= {new Student(101,"Narendra","narendrasahukrb@gmail.com",23),new Student(102,"Shrey","shreyngd@gmail.com",24)};
		 //stud[0] = new Student(101,"Narendra","narendrasahukrb@gmail.com",23);
		 
		 stud[0].display();
		 stud[1].display();
		
	}
	 
	public double calGPA(int q,int t,int a) { 
		double g=(q*0.2)+(t*0.5)+(0.3*a);
		return g;
	}
 }