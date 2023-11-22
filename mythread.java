import java.lang.*;




class ThreadDemo extends Thread{

	private Thread t;
	private String threadName;
	}

	ThreadDemo (String name){
		threadName = name;
		System.out.println("Creating" + threadName );

	}

	public void run(){
		System.out.println("Running" + threadName);
		try {
			for(int i = 4; i>0 ; i--){
				System.out.println("Threads : " + threadName + "  " + i);

				// let the thread sleep(5000);
			}
		} 
		catch (InterruptedException e){
			System.out.println("Thread " + threadName + " interrupted.");
			System.out.println("Thread "+ threadName + " exiting.");
		}

	}

public class TestThread{
	public static void main(String[] args) {
		ThreadDemo T1 = new ThreadDemo("Thread-1");
		T1.start();
		ThreadDemo T2 = new ThreadDemo("Thread-2");
		T2.start();                                       
		
	}

}