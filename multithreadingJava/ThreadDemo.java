package multithreadingJava;

public class ThreadDemo extends
  Thread{
	public void run()
	{
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo obj =new ThreadDemo();
		obj.start();
	}

}
