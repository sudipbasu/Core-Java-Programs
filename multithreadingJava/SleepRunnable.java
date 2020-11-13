package multithreadingJava;
class SleepMethod implements Runnable
{
	public void run()
	{
		int i=1;
		while(i<=10)
		{
			try
			{
				Thread.sleep(200);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(i+"\t");
			i++;
		}
	}
}
public class SleepRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepMethod obj = new SleepMethod();
		Thread t1 = new Thread(obj);
		t1.start();
//		try
//		{
//			t1.start();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
				
	}

}
