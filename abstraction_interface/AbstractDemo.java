package abstraction_interface;
abstract class Car
{
	abstract void start();
}
class Audi extends Car
{

	@Override
	void start() {
		System.out.println("In Audi method");
		
	}
	
}
class BMW extends Car
{

	@Override
	void start() {
		System.out.println("In BMW method");
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a1 = new Audi();
		a1.start();
		BMW b1 = new BMW();
		b1.start();
	}

}
