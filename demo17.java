package com.capgemini.test.module;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo17 {
	public static void main(String[] args) {
		String a[] = { "Hi", "How", "Are", "You" };
		List<String> arrlist = new ArrayList<>(Arrays.asList(a));
		if (arrlist.removeIf(s -> {
			System.out.println(s);
			return s.length() <= 2;
		})) {
			System.out.println("Removed");
		}
		

	}
}
