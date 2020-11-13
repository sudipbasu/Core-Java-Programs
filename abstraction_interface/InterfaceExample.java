package abstraction_interface;
interface Jet
{
	void fly();
}
public class InterfaceExample implements Jet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample obj =new InterfaceExample();
		obj.fly();
		
	}

	@Override
	public void fly() {
		System.out.println("Jet is Flying");
		
	}

}
