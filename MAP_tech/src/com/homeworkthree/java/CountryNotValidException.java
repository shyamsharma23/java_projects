package com.homeworkthree.java;

public class CountryNotValidException extends Exception {
	@Override
	public String getMessage() {
		return ("Employee should be an Indian citizen to calculate the tax");
	}
}
