package com.cdac.acts.utils;

import java.util.Comparator;

import com.cdac.acts.customer.Customer;

public class SortUtility implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getAmount()<o2.getAmount()) {
			return -1;
		}
		else if(o1.getAmount()==o2.getAmount()) {
			if(o1.getRegdate().compareTo(o2.getRegdate())<0)
				return -1;
			else if(o1.getRegdate().compareTo(o2.getRegdate())==0)
				return 0;
			else
				return 1;
		}
			
		else
			return 1;
	}

	
	
}
