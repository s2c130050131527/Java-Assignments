package com.cdac.acts.utils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class Try {

	public static void main(String[] args) throws Exception {
		try (Scanner sc = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader(sc.next()))) {//"D:/Java_116-115/collection_practice_hashmap/src/com/cdac/acts/utils/test.txt"))) {
			System.out.println("Enter file name to read");
			String line = null;
			while ((line = br.readLine()) != null)
				System.out.println(line);
			System.out.println("end of read");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}




