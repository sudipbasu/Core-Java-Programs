package multithreadingJava;

public class Sleep extends Thread{
	public void run()
	{
		for(int i = 1;i<=5;i++)
		{
			try
			{
				Thread.sleep(1000);
				
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
		Sleep obj =new Sleep();
		obj.start();
	
	}
}
