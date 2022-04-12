package com.tech.java;

public class Triangle {
	int numberOfSides = 3;
	int base = 10;
	int height = 5;
	
	public void calculateShapeArea() {
		double res = 0.5 * base * height;
		System.out.println("The area of triangle is "+res);
	}
	
	public static void main(String[] args) {
		Triangle obj;
		obj = new Triangle();
		obj.calculateShapeArea();
		
	}
}
