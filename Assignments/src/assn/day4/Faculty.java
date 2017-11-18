package assn.day4;

public class Faculty extends Person {
	private int yrsOfExp;
	private String sme;

	public Faculty(String firstName, String lastName,int seatno, int yrs, String sme) {
		super(firstName, lastName,seatno);
		yrsOfExp = yrs;
		this.sme = sme;
	}

	@Override
	public String toString() {
		return "Faculty " + super.toString() + " yrsOfExp=" + yrsOfExp + ", sme=" + sme;
	}

	@Override
	public void introduce() {
		System.out.println(getFirstName() + " teaching exp of " + yrsOfExp);

	}
	public void teach()
	{
		System.out.println(getFirstName()+" teaching in "+sme);
	}

	@Override
	public String cls() {
		return "Faculty";
	}

}
