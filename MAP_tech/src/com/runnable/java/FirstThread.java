package com.runnable.java;

//Runnable interface is predefined interface which can be used to create
//multithreaded program. it contains only single method that is run method
public class FirstThread implements Runnable{
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println("Value of x is "+x);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		FirstThread first=new FirstThread();
		Thread th1=new Thread(first);//I want to create a thread where the functionality is implemented using FirstThread class.
		Thread th2=new Thread(first);
		th1.start();
		th2.start();
		
		
	}
	

}