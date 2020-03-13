package com.capgemini.test.module;

public class demo11 extends demo10 {
	public void print() {
		System.out.println("Sub class");
	}
	public static void main(String[] args) {
		demo11 demo = new demo11();
		demo.print();
	}
}
