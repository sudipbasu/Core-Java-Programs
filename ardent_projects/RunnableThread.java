package ardent_projects;

public class RunnableThread implements Runnable {
	
	public void run()
	{
		System.out.println("Thread is Running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableThread obj =new RunnableThread();
		Thread t1 =new Thread(obj);
		t1.start();
	}

}
