package com.homeworkthree.java;

public class EmployeeNameInvalidException extends Exception {
	
	@Override
	public String getMessage() {
		return("The name is invalid");
	}

}
