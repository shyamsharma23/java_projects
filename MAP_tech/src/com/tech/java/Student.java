package com.tech.java;

public class Student {
	
	String name;
	
	public Student() {
		name = "No name is there";
		
	}
	public Student(String val) {
		name = val;
	}
	public void show() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.show();
		Student obj1 = new Student("John");
		obj1.show();
	}
}
