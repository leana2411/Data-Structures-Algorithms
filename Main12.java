import java.io.*;
class Main12{

	public static void main(String[] args)
	{
		myThread g = new myThread();
		g.start(); 

		myThread2 g2 = new myThread2();
		g2.start();
	}
}

class myThread extends Thread {
	public void run()
	{
		 try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}    
    System.out.println();
	int n = 100;
	System.out.print("Numbers from 1 to "+n+" are: ");
	
	for (int i = 1; i <= n; i++) {
		System.out.print(i + " ");
		    
  }    
	}
	}

class myThread2 extends Thread {
	public void run()
		{
	
	for (int i = 50; i <= 150; i++) {

		System.out.println("The ASCII value of " + (char)i + "=" + i);
	}
	}
	
	}