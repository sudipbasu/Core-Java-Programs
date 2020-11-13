package ExceptionHandling;
class Exception
{
	int i=50,j=0;
	public void show() {
		try {
			System.out.println(i/j);
		}
		catch(ArithmeticException e)
		{
			System.err.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}
	void message() {
		System.out.println("This is a message");
	}
}
public class TryCatchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception obj=new Exception();
		obj.show();
		obj.message();
	}

}
