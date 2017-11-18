package com.cdac.acts.io.utils;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cdac.acts.customer.Customer;

public class DataReader  {

	
	public static List<Customer> readData(String fileName) throws FileNotFoundException, IOException{
		List<Customer> list =new ArrayList<>();
		File file=new File(fileName);
		if(file.exists() && file.isFile() && file.canRead()) {
			
		
		try(DataInputStream in=new DataInputStream(
				new BufferedInputStream(
						new FileInputStream(fileName)))){
			while(in!=null) {
		Customer c=new Customer(in.readUTF(), in.readDouble(), in.readUTF(), in.readUTF(), in.readUTF());
			list.add(c);
			}
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		}
		else
			return null;
		return list;
	}
		
	
}
