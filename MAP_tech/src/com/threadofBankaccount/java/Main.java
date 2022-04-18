package com.threadofBankaccount.java;

public class Main {
	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		Threadone th1 = new Threadone(obj);
		Threadone th2 = new Threadone(obj);
		th1.start();
		th2.start();
	}
}
