package com.cdac.acts.io.utils;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.List;

import com.cdac.acts.customer.Customer;

public class DataWriter {

	public static void writeData(List<Customer> custList,String fileName) {

		try(DataOutputStream out=
				new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(fileName)))){
			for(Customer c:custList) {
				out.writeUTF(c.getEmail());
				out.writeDouble(c.getAmount());
				out.writeUTF(c.getRegdate().toString());
				out.writeUTF(c.getPassword());
				out.writeUTF(c.getName());
			}	
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void writeCustData(Customer c,String fileName) {

		try(DataOutputStream out=
				new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(fileName,true)))){
		
				out.writeUTF(c.getEmail());
				out.writeDouble(c.getAmount());
				out.writeUTF(c.getRegdate().toString());
				out.writeUTF(c.getPassword());
				out.writeUTF(c.getName());
	
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

}
