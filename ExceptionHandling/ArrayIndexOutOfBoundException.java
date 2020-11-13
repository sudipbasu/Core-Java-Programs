package ExceptionHandling;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,6};
		try
		{
			System.out.println(arr[10]);
		}
		catch(ArithmeticException e)
		{
//			System.err.println(e.getLocalizedMessage());
//			System.err.println(e);
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
		
		finally
		{
			System.out.println("Finally Block");
		}
	}

}
