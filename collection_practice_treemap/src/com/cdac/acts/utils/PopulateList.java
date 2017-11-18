package com.cdac.acts.utils;

import java.util.HashMap;
import java.util.Map;

import com.cdac.acts.customer.Customer;

public class PopulateList {

	public static Map<String,Customer> populate(){
		Map<String,Customer> al=new HashMap<String,Customer>();
		al.put("shreyngd@gmail.com",new Customer("shreyngd@gmail.com",5000,"hdhd#ggh","12-03-2017","Shrey"));
		al.put("naren@gmail.com",new Customer("naren@gmail.com",4500,"ghsv^h","13-10-2017","naren"));
		al.put("neha@gmail.com",new Customer("neha@gmail.com",3500,"hsdv#h","15-03-2017","neha"));
		al.put("shalin@gmail.com",new Customer("shalin@gmail.com",9500,"gsd@hd","12-05-2017","shalin"));
		return al;
	}
}
