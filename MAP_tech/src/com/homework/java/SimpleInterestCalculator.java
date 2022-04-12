package com.homework.java;
import java.util.*;

public class SimpleInterestCalculator {
	double principal_amount;
	int years;
	
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal amount:");
		principal_amount = sc.nextDouble();
		System.out.println("Enter the years:");
		years = sc.nextInt();
				
	}
	void calculateSimpleInterest() {
		double simpleInterest;
		if(principal_amount> 100000) {
			if(years>10) {
				
				simpleInterest = (principal_amount * years * 10)/100;
				System.out.println("The simple interest for a principal of"+ principal_amount+"and years of"+years+"is"+simpleInterest);
			}
			else if(years <10) {
				simpleInterest = (principal_amount * years * 9.5)/100;
				System.out.println("The simple interest for a principal of"+ principal_amount+"and years of"+years+"is"+simpleInterest);
				
			}
		}else if(principal_amount <100000) {
				if(years>10) {
				
				simpleInterest = (principal_amount * years * 5)/100;
				System.out.println("The simple interest for a principal of"+ principal_amount+"and years of"+years+"is"+simpleInterest);
			}
			else if(years <10) {
				simpleInterest = (principal_amount * years * 4.5)/100;
				System.out.println("The simple interest for a principal of"+ principal_amount+"and years of"+years+"is"+simpleInterest);
			
		}
	}
}
	public static void main(String[] args) {
		SimpleInterestCalculator obj = new SimpleInterestCalculator();
		obj.accept();
		obj.calculateSimpleInterest();
	}
	
}
