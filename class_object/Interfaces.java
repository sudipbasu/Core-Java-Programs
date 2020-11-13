package class_object;

public class Interfaces implements Car6,Person6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaces obj = new Interfaces();
		obj.start();
		obj.walk();
	}

	@Override
	public void start() {
		System.out.println("My Car is Starting");
		
	}

	@Override
	public void walk() {
		System.out.println("Walking");
		
	}

}
interface Car6
{
	void start();
}
interface Person6
{
	void walk();
}