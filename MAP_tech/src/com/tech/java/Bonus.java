package com.tech.java;
import java.util.*;

public class Bonus {
	int salary;
	Scanner sc;
	int year;
	
	public void accept() {
		sc = new Scanner(System.in);
		System.out.println("Enter the Salary");
		salary = sc.nextInt();
		System.out.println("Enter the year");
		year = sc.nextInt();
		if(year > 5) {
			double bonus = salary * 1.5; 
			System.out.println(bonus);
		}
	}
	public static void main(String[] args) {
		Bonus obj;
		obj  = new Bonus();
		obj.accept();
	}
	
}
