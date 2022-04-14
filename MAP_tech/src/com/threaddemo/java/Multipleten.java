package com.threaddemo.java;

public class Multipleten extends Thread {
	
	public void run() {
		for(int i = 1; i<=100; i++) {
			if(i % 10 == 0) {
				System.out.println(i);
			}
		}
	}
	

	public static void main (String[] args) {
		Multipleten obj = new Multipleten();
		Multiplethirty obj1 = new Multiplethirty();
		obj.start();
		obj1.start();
		
	}

}
