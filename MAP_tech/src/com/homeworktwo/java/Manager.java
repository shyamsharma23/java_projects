package com.homeworktwo.java;

public class Manager extends Employee {
	
	public Manager(long id, String name, String address, long phone, double basicSalary) {
		
		super(id, name, address, phone, basicSalary);
		
	}
	@Override
	public void calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = (0.15)*basicSalary;
		System.out.println("Transpost Allowance for manager is "+transportAllowance);
		
	}

}
