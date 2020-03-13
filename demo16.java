package com.capgemini.test.module;

public class demo16 {
	public static void main(String[] args) {
		String names[] = { "Thomas", "Peter", "Joseph" };
		String pwd[] = new String[3];
		int idx = 0;
		for (String n : names) {
			pwd[idx] = n.substring(2, 6);
			idx++;
		}
		
		for (int i = 0; i < pwd.length; i++) {
			System.out.println(pwd[i]);
		}
	}
}
