package com.trycatch.java;

import java.util.*;
public class MultiException {
	int arr[];
	private Scanner sc;
	public MultiException()
	{
		//0,1,2,3
		sc=new Scanner(System.in);
		arr=new int[4];
		for(int x=0;x<arr.length;x++)
		{
			System.out.println("Enter any number");
			arr[x]=sc.nextInt();
		}
		
	}
	public void divide()
	{
		System.out.println("Enter the index number for first number");
		int index1=sc.nextInt();
		System.out.println("Enter index number for second number");
		int index2=sc.nextInt();
		try
		{
		double result=arr[index1]/arr[index2];
		System.out.println("Result is "+result);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Trying to divide number by zero");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Trying to access beyound limit");
		}
	}
	public static void main(String[] args) {
		MultiException mx=new MultiException();
		mx.divide();
		
	}

}
