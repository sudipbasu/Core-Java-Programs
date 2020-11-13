package abstraction_interface;
interface Car20
{
	void Start();
	void Break();
}
public class InterfaceDemo implements Car20{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo obj =new InterfaceDemo();
		obj.Start();
		obj.Break();

	}

	@Override
	public void Start() {
		System.out.println("Car is Started");
		
	}

	@Override
	public void Break() {
		System.out.println("Car applies Break");
		
	}

}
