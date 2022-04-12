package com.tech.java;

public class Multiples {
	

	
	public static void main(String[] args) {
		int total = 0;
		for(int i = 0; i<=10; i+=5) {
			total = i + total;
		}
		System.out.println("total is "+ total);
	}

}
