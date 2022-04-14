package com.threaddemo.java;

public class Multiplethirty extends Thread {
	
	public void run() {
		for(int i = 1; i<=300; i++) {
			if(i % 30 == 0) {
				System.out.println(i);
			}
		}
	}

}