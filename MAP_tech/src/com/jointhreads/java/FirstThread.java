package com.jointhreads.java;

public class FirstThread extends Thread{
	public void run()
	{
		for(int x=1;x<=10;x++)
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
	public static void main(String[] args) {
		FirstThread first=new FirstThread();//this thread is in new thread stage
		
		first.start();
		try {
			first.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SecondThread second=new SecondThread();
		second.start();
		try {
			second.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//second.start();//As soon as you call start method it will come in runnable stge 
		//and internally it will call run method where u will write all the logic which u want 
		//to perform whenever thread is started.
	}

}
/*
 * Rigth now there is only one thread that is main thread or it is also called daemon thread.
 * 
 */