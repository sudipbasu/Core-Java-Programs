package multithreadingJava;

public class SleepDemo extends Thread{
	public void run()
	{
		for(int i=0;i<=10;i++) {
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepDemo obj =new SleepDemo();
		obj.start();
	}

}
