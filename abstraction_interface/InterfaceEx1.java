package abstraction_interface;
interface Car15
{
	int price();
}
public class InterfaceEx1 implements Car15{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEx1 obj =new InterfaceEx1();
		System.out.println(obj.price());

	}
	@Override
	public int price()
	{
		return 100;
	}
}
