package com.interfacehw.java;

public class AdultUser implements LibraryUser {
	
	private int age;
	private String bookType;
	
	public AdultUser (int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}

	public void registerAccount() {
		if(age>=12) {
			System.out.println("You have successfully created account under Adults account");
		} else {
			System.out.println("Your age must be greater than 12 to register under Adults account");
		}
	}
	
	public void requestBook() {
		if(bookType == "Fiction") {
			System.out.println("Book issued successfully, please return the book within 7 days");
		} else if(bookType == "Kids") {
			System.out.println("You are allowed to issue only Adult Fiction book");
		}
	}
}
