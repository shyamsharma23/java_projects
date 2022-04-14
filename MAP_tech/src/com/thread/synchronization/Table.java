package com.thread.synchronization;
public class Table {
	
	synchronized public void printTable(int value)
	{//5
		//5*1=5
		//5*2=10
		for(int x=1;x<=10;x++)
		{
			
			System.out.println(value+"*"+x+"="+(value*x));
			
		}
	}

}
//Only one thread will be able to access it at one time


