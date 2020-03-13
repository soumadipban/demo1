package com.capgemini.test.module;

public class demo18 {
	public static void main(String[] args) {
		String[] str = { "A", "B", "C", "D" };
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i] + " ");
			if (str[i].equals("D")) {
				System.out.println("Work Done");
				break;
			}
			
			continue;
		}
		
	}
}
