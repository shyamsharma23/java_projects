package com.abstractclass.java;

public class Rectangle extends Shape {
	
	double length;
	double width;
	
	@Override
	public double area() {
		double result = length * width;
		return result;
	}
	public String toString() {
		String res = "This is a Rectangle";
		return res;
	}
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.area();
		String res = obj.toString();
		System.out.println(res);
	}

}
