package com.capgemini.test.module;

public class demo13 {
	public static void main(String[] args) {
		
		demo13 demo  = new demo13();
		demo13 demo1 = new demo13();
		demo13 demo2 = new demo13();
		demo = demo1;
		demo2 = demo1;
		demo2 = null;
		
		
		System.gc();
		
		System.out.println(demo);
		
		
	}
}
