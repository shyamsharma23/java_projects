package com.threadofBankaccount.java;

public class Threadone extends Thread {
	
	BankAccount obj;
	
	public Threadone(BankAccount obj) {
		this.obj = obj;
	}
	
	
	
	public void run() {
		
		obj.withdraw(70000);
		
	}

}
