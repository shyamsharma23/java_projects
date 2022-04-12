package com.interfacehw.java;

public class LibraryInterfaceDemo {
	
	public static void main(String[] args) {
		KidUsers obj = new KidUsers(18, "Kids");
		obj.registerAccount();
		obj.requestBook();
		AdultUser obj1 = new AdultUser(23, "Fiction");
		obj1.registerAccount();
		obj1.requestBook();
	}

}
