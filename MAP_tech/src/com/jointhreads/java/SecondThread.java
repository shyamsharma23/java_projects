package com.jointhreads.java;

public class SecondThread extends Thread {
	
	public void run()
	{
		for(int x=10;x>=1;x--)
		{
			System.out.println("The value of x is "+x);
			try
			{
			Thread.sleep(2000);
			}
			catch(InterruptedException ex)
			{
				System.out.println("Thread interrupted");
			}
		}
			
	}

}
