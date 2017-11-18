package assn.day4;

public class Student extends Person {
	private int gradYear;
	private String courseName;
	public Student(String fName,String lName,int seatno,int yr,String cName) {
		//invokes super cls's matching constr
		super(fName,lName,seatno);
		gradYear=yr;
		courseName=cName;
		
	}
	@Override
	public String toString()
	{
		return "Student "+super.toString()+" "+gradYear+" "+courseName;
	}
	@Override
	public  void introduce()
	{
		System.out.println(getFirstName()+" graduated in "+gradYear);
	}
	//additional behaviour
	
	public void study()
	{
		System.out.println(getFirstName()+" studying in "+courseName);
	}
	@Override
	public String cls() {
		return "Student";
	}
}
