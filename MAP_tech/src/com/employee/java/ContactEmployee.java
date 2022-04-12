package com.employee.java;

public class ContactEmployee extends Employee {
	
	private int contractAmount;
	private int duration;
	
	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter the COntract amount: ");
		contractAmount = sc.nextInt();
		System.out.println("Enter the duration: ");
		duration = sc.nextInt();
	}
	@Override
	public void display() {
		System.out.println("The contract amount is "+ contractAmount);
	}
	public static void main(String[] args) {
		ContactEmployee obj = new ContactEmployee();
		obj.accept();
		obj.display();
		
	}
}
