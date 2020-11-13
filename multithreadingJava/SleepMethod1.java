package multithreadingJava;
class myClass extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
public class SleepMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myClass obj = new myClass();
		obj.start();
		try
		{
			obj.start();
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		
	}

}
