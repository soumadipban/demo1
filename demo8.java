package com.capgemini.test.module;

public class demo8 extends demo7 {
	public int doIt(String str, Integer... data) {
		String signature = "(String, Integer[])";
		System.out.println("Overridden: " + str + " " + signature);
		return 0;
	}

	public static void main(String... args) {
		demo7 sb = new demo8();
		try {
			sb.doIt("hello", 3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
