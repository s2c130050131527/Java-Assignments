package com.cdac.acts.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.cdac.acts.cust_exceptions.CustomerException;
import com.cdac.acts.customer.*;

public class ValidationUtil {
	private static SimpleDateFormat sdf;
	private String fin_date="31-03-2018";
	private Date enddate;
	private static String regex="^[a-zA-Z]+[0-9]*@[a-z]+(.com)$";
	private static String passregex="[a-z]+[a-z0-9]*\\p{Punct}+[a-z0-9]*";

	//validating E-mail
	public boolean validateMail(String email) throws CustomerException {
		if(email.length()<5 || email.length()>15) {
			throw new CustomerException("Email should be 5 to 15 characters long");
		}
		else if(email.matches(regex)) {
			return true;
		}
		else {
			throw new CustomerException("E-mail is not in the format");
		}
	}
	
	//validating Password
	public boolean validatePassword(String pass) throws CustomerException {
		if(pass.length()<6 || pass.length()>10) {
			throw new CustomerException("Password should be 6-10 characters long");
		}
		else if(pass.matches(passregex)) {
			return true;
		}
		else {
			throw new CustomerException("Password must contain special characters");
		}
	}
	
	//validating Amount
	public boolean validateAmount(double amount) throws CustomerException{
		if(amount<500 || (amount%500)!=0) {
			throw new CustomerException("Amount should be multiple of 500");
		}
		return true;
	}
	
	//validating Date
	public boolean validateDate(String dat) throws CustomerException {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		Date given = null;
		try {
			enddate=sdf.parse(fin_date);
			given = sdf.parse(dat);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(given.before(enddate)) {
			return true;
		}
		else {
			throw new CustomerException("Invalid Date!!");
		}
		
	}
	
}
