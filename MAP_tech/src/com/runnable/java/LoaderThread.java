package com.runnable.java;

import java.text.DecimalFormat;

public class LoaderThread implements Runnable{
	
	int startNumber;
	int lastNumber;
	
	public LoaderThread(int startNumber, int lastNumber) {
		this.startNumber = startNumber;
		this.lastNumber = lastNumber;
		
	}
	
	@Override
	public void run() {
		ListLoader obj = new ListLoader();
		long start = System.currentTimeMillis();
		obj.loadList(startNumber, lastNumber);
		long end = System.currentTimeMillis();
		DecimalFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");

	}

}
