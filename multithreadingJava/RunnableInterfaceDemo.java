package multithreadingJava;

public class RunnableInterfaceDemo implements Runnable{
	public void run()
	{
		System.out.println("Hi This is Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableInterfaceDemo obj = new RunnableInterfaceDemo();
		Thread t1 = new Thread(obj);
		t1.start();
	}

}
