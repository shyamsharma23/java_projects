package com.trycatch.java;
import java.util.*;
public class NumberFormat {
	
	public static void main(String[] args) {
		
		int number;
		//There can be multiple catch handler for single try but there will be only one finally block for one try
		Scanner sc = new Scanner(System.in);
		
		try {
			number =Integer.parseInt(sc.next());
			System.out.println("You Entered"+ number);
		}
		catch(NumberFormatException e) {
			System.out.println("This is a Number format exception");
		}
		catch(Exception e) {
			System.out.println("Any type of exception can be handled here");
		}
		finally {
			System.out.println("Write all the statments which will execute whether exception comes or not");
		}
	}

}
