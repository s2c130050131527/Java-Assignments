package com.prafulsir.quest;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("str");
		System.out.println(l1);
		l1.add("abc");
		
		for(String str:l1) {
			System.out.println(str);
			//l1.add("new"); //it will throw ConcurrentModificationException
			System.out.println(l1);
		}
	}
}
