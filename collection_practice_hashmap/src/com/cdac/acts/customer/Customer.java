package com.cdac.acts.customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable<Customer>{

	private String email;
	private double amount;
	private String password;
	private String regdate;
	private String name;
	private static SimpleDateFormat sdf;
	
	public Customer(String mail) {
		email=mail;
	}
	
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
	public String getEmail() {
		return email;
	}/*
	public void setEmail(String email) {
		this.email = email;
	}*/
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
	//return date
	public Date getRegdate() {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date enddate = null;
		try {
			enddate = sdf.parse(regdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return enddate;
	}/*
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
				+ ", name=" + name + "\n";
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
	
	
	public boolean checkMail(String mail) {
		if(mail.equals(email)) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Customer o) {
		return email.compareTo(o.email);
	}
	
	
	
}
