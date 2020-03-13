package com.capgemini.test.module;

import java.util.Map;
import java.util.TreeMap;

public class demo {
	public static void main(String[] args) {
		String[] words = new String[] { "a" , "a" , "b" , "a"};
		Map<String, Integer> m = new TreeMap<String, Integer>();
		for (String word : words) {
			Integer freq = m.get(word);
			m.put(word, freq == null ? 1 : freq + 1);
		}
		System.out.println(m);
	}
}
