package abstraction_interface;
interface Car10
{
	void Start();
}
public class InterfaceTest1 implements Car10{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTest1 obj =new InterfaceTest1();
		obj.Start();
	}

	@Override
	public void Start() {
		System.out.println("Car is Started");
		
	}

}
