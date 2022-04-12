package com.tech.java;
import java.util.Scanner;

public class Calculator {
	
	int number1;
	int number2;
	Scanner sc;
	
	public void accept() {
		sc = new Scanner(System.in);
		System.out.println("Enter the number one:");
		number1 = sc.nextInt();
		System.out.println("Enter the number two:");
		number2 = sc.nextInt();
	}
	
	public void add() {
		int sum;
		sum = number1 + number2;
		System.out.println("The sum is "+ sum);
	}
	
	public void sub() {
		int diff;
		diff = number1 - number2;
		System.out.println("The difference is "+ diff);
	}
	public void multiply() {
		int result = number1 * number2;
		System.out.println("The product is "+result);
	}
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.accept();
		obj.add();
		obj.sub();
		obj.multiply();
				
			}

		
	}
	

