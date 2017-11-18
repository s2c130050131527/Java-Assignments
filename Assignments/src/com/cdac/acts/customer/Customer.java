package com.cdac.acts.customer;

public class Customer {

	private String email;
	private double amount;
	private String password;
	private String regdate;
	private String name;
	
	public Customer(String email, double amount, String password, String regdate, String name) {
		super();
		this.email = email;
		this.amount = amount;
		this.password = password;
		this.regdate = regdate;
		this.name = name;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	/*public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
	@Override
	public String toString() {
		return "Customer email=" + email + ", amount=" + amount + ", regdate=" + regdate
				+ ", name=" + name + "";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null || obj instanceof Customer) {
			if(email.equals(((Customer)obj).email)) {
			return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
}
