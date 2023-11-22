public class Main4{
	public static void main (String[] args){
		System.out.println("Hello World");
		System.out.println(Thread.currentThread().getName());
         Thread T1 = new Thread("MyThread");
         T1.start();
         T1.currentThread().getName();

	}
}