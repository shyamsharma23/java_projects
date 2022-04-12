package com.interfacehw.java;

public class KidUsers implements LibraryUser {
	
	private int age;
	private String bookType;
	
	public KidUsers(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
	
	public void registerAccount() {
		if(age<12) {
			System.out.println("You have successfully created account under Kids account");
		} else {
			System.out.println("Your age must be less than 12 to register under kids account");
		}
	}
	
	public void requestBook() {
		if(bookType == "Kids") {
			System.out.println("Book issued successfully, please return the book within 10 days");
		} else if(bookType == "Fiction") {
			System.out.println("You are allowed to issue only kids book");
		}
	}

}
