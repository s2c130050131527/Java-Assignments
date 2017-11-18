package assn.day4;

public abstract class Person {
	private String firstName, lastName;
	private int seatno;

	public Person(String firstName, String lastName,int seatno) {
		// super();//implicitly calling super cls constr
		this.firstName = firstName;
		this.lastName = lastName;
		this.seatno=seatno;
	}

	// override toString --to replace hashcode
	// version by actual details
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
	// declare abstract method introduce() -- since its a common feature across
	// sub-classes
	public abstract void introduce();

	public String getFirstName() {
		return firstName;
	}
	
	public abstract String cls();
}
