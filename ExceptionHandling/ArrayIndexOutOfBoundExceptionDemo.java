package ExceptionHandling;
class Exception2{
	int arr[]= {1,2,3,4};
	void func()
	{
		try
		{
			System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This is Finally Block");
		}
	}
}
public class ArrayIndexOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception2 obj=new Exception2();
		obj.func();
	}

}
