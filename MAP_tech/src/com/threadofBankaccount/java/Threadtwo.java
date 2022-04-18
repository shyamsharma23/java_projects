package com.threadofBankaccount.java;

public class Threadtwo extends Thread {
	
	BankAccount obj;
	
	public Threadtwo(BankAccount obj) {
		this.obj = obj;
	}
	
	
	
	public void run() {
		
		obj.deposit(50000);
		
	}

}
