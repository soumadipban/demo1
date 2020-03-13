package com.capgemini.test.module;

import java.time.LocalDate;

public class demo19 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2012, 1, 30);
		date.plusDays(10);
		System.out.println(date);
		
	}
}
