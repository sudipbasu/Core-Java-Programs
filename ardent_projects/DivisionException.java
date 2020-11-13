package ardent_projects;

public class DivisionException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=50,j=0;
		int data;
		try
		{
			data=i/j;
			System.out.println(data);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Exception Resolved");
		}
	}

}
