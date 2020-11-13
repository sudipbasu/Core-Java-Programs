package abstraction_interface;
abstract class myCar6
{
	abstract void Start();
	abstract void Break();
}
class myBMW6 extends myCar6
{

	@Override
	void Start() {
		System.out.println("BMW is Start");
		
	}

	@Override
	void Break() {
		System.out.println("BMW apply a Break");
		
	}
	
}
class myAudi6 extends myCar6
{

	@Override
	void Start() {
		System.out.println("Audi is Start");
		
	}

	@Override
	void Break() {
		System.out.println("Audi apply a Break");
		
	}
	
}
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myBMW6 bmw = new myBMW6();
		bmw.Start();
		bmw.Break();
		myAudi6 audi = new myAudi6();
		audi.Start();
		audi.Break();

	}

}
