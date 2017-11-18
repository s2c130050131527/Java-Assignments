package com.cdac.acts.utils;

import java.util.ArrayList;
import java.util.List;

import com.cdac.acts.customer.Customer;

public class PopulateList {

	public static List<Customer> populate(){
		List<Customer> al=new ArrayList<>();
		al.add(new Customer("shreyngd@gmail.com",5000,"hdhd#ggh","12-03-2017","Shrey"));
		al.add(new Customer("naren@gmail.com",4500,"ghsv^h","13-10-2017","naren"));
		al.add(new Customer("neha@gmail.com",3500,"hsdv#h","15-03-2017","neha"));
		al.add(new Customer("shalin@gmail.com",4500,"gsd@hd","12-05-2017","shalin"));
		return al;
	}
}
