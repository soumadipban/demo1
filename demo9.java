package com.capgemini.test.module;

public class demo9 {
	public static void main(String[] args) {
		for(int i = 2; i < 4; i++)
		{
			for(int j = 2; j < 4; j++)
			{
			assert i!=j : 2;
				System.out.println("hello");
			}
		}
	}
}
