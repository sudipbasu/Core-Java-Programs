package abstraction_interface;
interface Sum
{
	int  addition(int a,int b);
}
public class AdditionInterface implements Sum{
	public int addition(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionInterface obj =new AdditionInterface();
		System.out.println(obj.addition(5, 6));

	}

}
