package com.congnizant.shapes;

public class Circle {
	private float radius;
	protected float pi;
	
	public Circle() {  			//Constructor 1
		radius = 1.5f;
	}
	protected Circle(float radius) { //Constructor 2
		this(5.5f, 3.14f);
		this.radius = radius;
		
	}
	public Circle(float radius, float pi) { //Constructor 3
		this.pi = 3.5f;
		this.radius = radius;
		
	}
	float calculateCircleArea(float radius) {
		float result = pi * radius * radius;
		return result;
	}
	float caluculateCircumference(float radius) {
		float circumference = 2 * pi * radius;
		return circumference;
	}
	public static void main(String[] args) {
		Circle obj = new Circle(1.5f, 3.14f);
		float area = obj.calculateCircleArea(1.5f);
		float circum = obj.caluculateCircumference(1.5f);
		System.out.println("The area is "+ area);
		System.out.println("The Circumference is "+ circum);
	}
}
