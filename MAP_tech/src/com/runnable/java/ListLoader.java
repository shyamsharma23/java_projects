package com.runnable.java;

import java.text.DecimalFormat;
import java.util.ArrayList;

import com.trycatch.java.NumberFormat;

public class ListLoader {
	
	int L=0;
	
	public void loadList(int startNumber, int lastNumber) {
		for(L=startNumber; L<=lastNumber; L++) {
			
			System.out.println(L);
			
		}
	}
	
	public static void main(String[] args) {
		ListLoader obj = new ListLoader();
		long start = System.currentTimeMillis();
		obj.loadList(0, 10000000);
		long end = System.currentTimeMillis();
		DecimalFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");

	}

}
