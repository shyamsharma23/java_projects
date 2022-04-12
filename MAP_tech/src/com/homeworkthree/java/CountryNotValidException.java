package com.homeworkthree.java;

public class CountryNotValidException extends Exception {
	@Override
	public String getMessage() {
		return ("Country is not valid");
	}
}
