package ExceptionHandling;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int data=200/0;
			System.out.println(data);
		}
		
		
		catch(ArithmeticException e)
		{
			//System.err.println(e.getLocalizedMessage());
			e.printStackTrace();
			System.out.println("Rest Of the code");
		}
	}

}
