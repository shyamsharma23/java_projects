package com.threadofBankaccount.java;

public class BankAccount {
	double amount = 80000;
	
	synchronized public void withdraw(double val) {
		if(val > amount) {
			System.out.println("Insufficient balance");
		}
		else {
			amount = amount - val;
		}
	}
	
	synchronized public void deposit(double val) {
		amount = amount + val;
	}
	

}
