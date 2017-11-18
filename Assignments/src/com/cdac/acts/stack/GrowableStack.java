package com.cdac.acts.stack;

import com.cdac.acts.empdtails.Employee;

public class GrowableStack extends Stack {
	
	public GrowableStack(int n) {
		// TODO Auto-generated constructor stub
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
		else
		{
			Employee[] arr=new Employee[array.length*2];
	
			for(int i=0;i<array.length;i++)
			{
				arr[i]=array[i];
			}
			array=arr;
			top++;
			array[top]=element;
			System.out.println("Increased size="+array.length);
			return true;
		}
	
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
		String arr="Employees Elements:";
		for(int i=0;i<=top;i++)
		{
			arr+=array[i].toString()+"\n";
		}
		arr+="----------------------";
		return arr;
		
		
	}

}
