package ExceptionHandling;

public class StringIndexOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Computer";
		try
		{
			str.charAt(40);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
	}

}
