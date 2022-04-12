package com.abstractclass.java;
import java.util.*;

public abstract class Shape {
	String color;
	protected Scanner sc;
	
	public abstract double area();
	
	public abstract String toString();
	
	public String getColor() {
		String res = "This is a blue colored circle";
		return res;
	}
	
}
