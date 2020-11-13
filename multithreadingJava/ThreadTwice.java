package multithreadingJava;

public class ThreadTwice extends Thread{
	
	public void run()
	{
		System.out.println("Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTwice t1 = new ThreadTwice();
		t1.start();
		try
		{
			t1.start();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
