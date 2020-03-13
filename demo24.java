package com.capgemini.test.module;

public class demo24 {
	public static void main(String[] args) {
		demo23 demo = new demo23();
		demo23 demo1 = new demo23();
		demo23 demo2 = new demo23();

		demo = demo2;
		demo2 = demo1;
		demo1 = null;
		
		System.out.println(demo);
		System.out.println(demo1);
		System.out.println(demo2);
	}

}
