package com.homeworkthree.java;


public class TaxCalculator {
	
	String empName;
	boolean isIndian;
	double empSal;
	
	public TaxCalculator(String name, boolean val, double sal) {
		this.empName = name;
		this.isIndian = val;
		this.empSal = sal;
	}
	
	public double calculateTax() throws CountryNotValidException{
		if(isIndian == false) {
			throw new CountryNotValidException();
		}
		
	}
	
	public static void main(String[] args) {
		TaxCalculator obj = new TaxCalculator("Shyam", true, 100000);
		try {
			obj.calculateTax();
		}
		catch(CountryNotValidException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
