package class_object;
abstract class Car1
{
	int price;
	abstract void start();
}
class Audi1 extends Car1
{
	@Override
	void start()
	{
		System.out.println("Audi1 is here");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a1 = new Audi();
		a1.start();
	}

}
