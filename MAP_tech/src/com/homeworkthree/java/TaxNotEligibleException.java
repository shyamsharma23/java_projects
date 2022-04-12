package com.homeworkthree.java;

public class TaxNotEligibleException extends Exception {
	
	@Override
	public String getMessage() {
		return ("The employee does not need to pay the Tax");
	}

}
