package class_object;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a1 = new Audi();
		a1.start();
		BMW b1 =new BMW();
		b1.start();
	}

}
class Audi extends Car{

	@Override
	void start() {
		
		System.out.println("BMW is Starting");
	}
	
}
class BMW extends Car{

	@Override
	void start() {
		
		System.out.println("Audi is Starting");
	}
	
}
abstract class Car
{
	
	int price;
	abstract void start();
	
}