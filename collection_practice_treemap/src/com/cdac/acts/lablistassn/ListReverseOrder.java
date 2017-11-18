package com.cdac.acts.lablistassn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListReverseOrder {

	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<15;i++) {
			list.add(new Random().nextInt(1000));
		}
		System.out.println(list);
		System.out.println("Enter the index : ");
		int count=0;
		for(Integer i:list) {
			count++;
		}
		int index=sc.nextInt();
		Iterator<Integer> fiterator=list.iterator();
		Iterator<Integer> siterator=list.iterator();
		for(int i=0;i<index;i++) {
			fiterator.next();
		}
		while(fiterator.hasNext()) {
			fiterator.next();
			siterator.next();
		}
		System.out.println("the element is : "+siterator.next());
		
	}
	
}
