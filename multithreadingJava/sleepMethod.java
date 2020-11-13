package multithreadingJava;

public class sleepMethod extends Thread{
	
	public void run()
	{
		for(int i = 1;i<5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sleepMethod obj =new sleepMethod();
		obj.start();
	}

}
