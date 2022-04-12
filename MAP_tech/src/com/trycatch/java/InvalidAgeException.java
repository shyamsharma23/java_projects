package com.trycatch.java;

public class InvalidAgeException extends Exception {
	
	@Override
	public String getMessage() {
		return("This is a invalid age exception");
	}

}
