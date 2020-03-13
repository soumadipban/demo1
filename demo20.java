package com.capgemini.test.module;

public class demo20 {
	public static void main(String[] args) {
		int a[][] = {{1,2,4,5},{3,4}};

		
		for (int[] is : a) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
			
		}
		
		System.out.println(a.length);
		System.out.println(a[0].length);
	}
}
