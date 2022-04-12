package com.tech.java;
import java.util.*;

public class MaxThree {
	
	int num1;
	int num2;
	int num3;
	Scanner sc;
	
	public void accept() {
		sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		num1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		num2 = sc.nextInt();
		System.out.println("Enter number 3: ");
		num3 = sc.nextInt();
		if(num1 > num2) {
			if(num1>num3) {
				System.out.println("number 1 is maximum");
			}
			else {
				System.out.println("number 3 is maximum");
			}
		}else {
			if(num2 > num3) {
				System.out.println("number 2 is maximum");
			
		}
			else {
				System.out.println("number 3 is maximum");
			}
		}
		
	}
	public static void main(String[] args) {
		MaxThree obj;
		obj = new MaxThree();
		obj.accept();
	}
	

}
