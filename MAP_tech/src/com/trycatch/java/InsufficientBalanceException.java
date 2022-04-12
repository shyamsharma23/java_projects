package com.trycatch.java;


public class InsufficientBalanceException extends Exception {
	
@Override
public String getMessage()
{
	return "Amount is greater than the balance";
}
}