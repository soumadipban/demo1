package com.capgemini.test.module;

public class demo7 {
	public int doIt(String str, Integer... data) throws Exception {
		String signature = "(String, Integer[])";
		System.out.println(str + " " + signature);
		return 1;
	}
}
