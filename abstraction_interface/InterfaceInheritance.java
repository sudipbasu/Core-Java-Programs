package abstraction_interface;
interface Car9
{
	void Start();
}
interface Person9 extends Car9
{
	void Walk();
}
public class InterfaceInheritance implements Person9{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceInheritance obj = new InterfaceInheritance();
		obj.Start();
		obj.Walk();
	}

	@Override
	public void Start() {
		System.out.println("Car is Starting");
		
	}

	@Override
	public void Walk() {
		System.out.println("Person is Walking");
		
	}

}
