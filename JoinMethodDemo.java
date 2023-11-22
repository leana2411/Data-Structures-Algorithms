import java.lang.*;
class Join_method {
	public static void main(String[] args) throws Exception{
joindemocls t = new joindemocls();
t.start();
t.join();
		for(int j=1;j<5;j++){
			System.out.println("Main thred j=+1");

		}
		System.out.println("Exhibiting from main thread ");
	}
}

public class joindemocls extends Thread {
	public void run()
	{
		for(int i = 1; i<5; i++){
			System.out.println("Chiled thread i = +1");
		}
		 System.out.println("Exhibiti from my thread");
	}

}