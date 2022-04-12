package com.abstractclass.java;

public class Circle extends Shape {
	
	double radius;
	
	@Override
	public double area() {
		double result = 3.14 * radius * radius;
		return result;
	}
	public String toString() {
		String res = "This is a Circle";
		return res;
	}
	
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.area();
		String res = obj.toString();
		System.out.println(res);
	}

}
