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
	
	public double calculateTax() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		double taxAmount;

		if(isIndian == false) {
			throw new CountryNotValidException();
		}
		if(empName == null || empName == "") {
			throw new EmployeeNameInvalidException();
		}
		if(empSal > 100000 && isIndian == true) {
			taxAmount = 0.08 * empSal;
			return taxAmount;
			
		}else if((empSal > 50000 && empSal < 100000) && isIndian == true) {
			taxAmount = 0.06 * empSal;
			return taxAmount;
		}else if((empSal > 30000 && empSal < 50000) && isIndian == true) {
			taxAmount = 0.05 * empSal;
			return taxAmount;
		}else if((empSal > 1000 && empSal < 30000) && isIndian == true) {
			taxAmount = empSal * 0.04;
			return taxAmount;
		} else {
			throw new TaxNotEligibleException();
		}
		
	}
	
	public static void main(String[] args) {
		TaxCalculator obj = new TaxCalculator("", true, 30000);
		try {
			double res = obj.calculateTax();
			System.out.println("The tax amount is "+res);
		}
		catch(CountryNotValidException ex) {
			System.out.println(ex.getMessage());
		}
		catch(EmployeeNameInvalidException ex) {
			System.out.println(ex.getMessage());
		}
		catch(TaxNotEligibleException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
