package com.cdac.acts.stack;

import com.cdac.acts.empdtails.Employee;

public abstract class Stack {

	int top=-1;
	Employee[] array;
	
	public abstract boolean push(Employee element);
	public abstract Employee pop();
	public abstract boolean isFull();
	public abstract boolean isEmpty();
	
	

	
}
