package com.homeworktwo.java;

public class Employee {
	
	long employeeid;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
	public Employee() {
		System.out.println("This is a super class default constructor");
	}
	
	public Employee(long id, String name, String address, long phone, double basicSalary) {
		this.employeeid = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
		this.basicSalary = basicSalary;
	}
	
	public void calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
		System.out.println("Calculated salary is"+salary);
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = (0.1)*basicSalary;
		System.out.println("Transpost Allowance is "+transportAllowance);
		
	}

}
