package com.capgemini.test.module;

import java.util.LinkedList;
import java.util.Queue;

public class demo12 {

	public static void main(String... args) {
		Queue q = new LinkedList();
		q.add("newyork");
		q.add("ca");
		q.add("texas");
		show(q);
	}

	public static void show(Queue q) {
		q.add(new Integer(11));
		while (!q.isEmpty())
			System.out.print(q.poll() + " ");
	}
}
