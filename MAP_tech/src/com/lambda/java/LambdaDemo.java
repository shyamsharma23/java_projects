package com.lambda.java;

public class LambdaDemo {
	public void display()
	{
		MyDetails det=(number1,number2)->{
			System.out.println("Welcome to lambda expression");
		};
		det.personalDetails(12, 23);
	}
	public static void main(String[] args) {
		LambdaDemo lamdemo=new LambdaDemo();
		lamdemo.display();
	}
}



