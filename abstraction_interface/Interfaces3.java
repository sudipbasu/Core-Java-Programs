package abstraction_interface;
interface Car8
{
	void Start();
}
interface Person8
{
	void walk();
}
public class Interfaces3 implements Car8,Person8{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaces3 obj =new Interfaces3();
		obj.Start();
		obj.walk();
	}

	@Override
	public void walk() {
		System.out.println("Person is walking");
		
	}

	@Override
	public void Start() {
		System.out.println("Car is Starting");
		
	}

}
