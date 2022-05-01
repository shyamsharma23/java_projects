package com.lambda.java;

public class Main {
	public void show() {
		Message msg =(name) ->{
			System.out.println("Displaying the message");
		};
		msg.showMessage("John");
	}
	
	public static void main(String[] args) {
		
	}
}
