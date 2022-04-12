package com.tech.java;

public class Square {
	int numberOfSides = 4;
	int sideLength = 10;
	
	public void calculateShapeArea() {
		int res = sideLength * sideLength;
		System.out.println("The area of square is "+res);
	}
	
	public static void main(String[] args) {
		Square obj;
		obj = new Square();
		obj.calculateShapeArea();
		
	}
}
