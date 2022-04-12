package com.tech.java;
import java.util.*;

public class EvenOdd {
	
	

	public static void main(String[] args) {
		Scanner sc;
		
		int num;
		for(int i = 0; i<10; i++) {
			sc = new Scanner(System.in);
			System.out.println("Enter the number");
			num = sc.nextInt();
			if(num % 2 == 0) {
				System.out.println("The number is even");
			}
			else {
				System.out.println("The number is odd");
			}
		}
		
	}
}
