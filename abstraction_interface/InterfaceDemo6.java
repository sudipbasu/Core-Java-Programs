package abstraction_interface;
interface Circle
{
	int  Area(int r);
}
public class InterfaceDemo6 implements Circle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo6 obj =new InterfaceDemo6();
		System.out.println(obj.Area(5));
	}

	@Override
	public int Area(int r) {
		
		return r*r;
	}

}
