package com.homeworktwo.java;

public class InheritanceActivity {
	public static void main(String [] args) {
		Manager obj = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		obj.calculateSalary();
		Trainee obj1 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		obj1.calculateSalary();
		obj.calculateTransportAllowance();
		obj1.calculateTransportAllowance();
	}
}
