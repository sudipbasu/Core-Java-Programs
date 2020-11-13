package multithreadingJava;

public class Demo1 extends Thread{
	public void run()
	{
		System.out.println("Hi this is a Thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 demo = new Demo1();
		demo.start();
	}

}
