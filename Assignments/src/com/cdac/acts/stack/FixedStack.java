package com.cdac.acts.stack;

import com.cdac.acts.empdtails.Employee;

public class FixedStack extends Stack {
	
	FixedStack(int n)
	{
		array=new Employee[n];
	}

	@Override
	public boolean push(Employee element) {
		// TODO Auto-generated method stub
		if(!isFull())
		{
		top++;
		array[top]=element;
		return true;
		}
		return false;
		
	}

	@Override
	public Employee pop() {
		// TODO Auto-generated method stub
		if(!isEmpty())
		{
			Employee ele=array[top];
			top--;
			return ele;
		}
		return null;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(top==array.length-1)
		{
		return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top==-1) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String arr="All Elements:";
		for(int i=0;i<=top;i++)
		{
			arr+=array[i].toString()+"\n";
		}
		arr+="-----------------";
		return arr;
	}

}
