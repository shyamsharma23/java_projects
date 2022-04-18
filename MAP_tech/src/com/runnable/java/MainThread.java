package com.runnable.java;

public class MainThread {
	
	public static void main(String[] args) {
		LoaderThread first = new LoaderThread(0,5000000);
		Thread th1 = new Thread(first);
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoaderThread second = new LoaderThread(5000000,10000000);
		Thread th2 = new Thread(second);
		th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
