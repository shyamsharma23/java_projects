package com.bankaccountThread.java;

public class BankAccount {
	double balance=80000;
	public synchronized void withdraw(double amount)
	{
		if(balance<amount)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
		balance=balance-amount;
		System.out.println("Updated balance is "+balance);
		}
	}

}