package abstraction_interface;
abstract class Car7
{
	void note()
	{
		System.out.println("Best Car");
	}
	abstract void desc();
}
class BMW7 extends Car7
{

	@Override
	void desc() {
		System.out.println("This is BMW");
		
	}
	
}
class Audi7 extends Car7
{

	@Override
	void desc() {
		System.out.println("This is Audi");
		
	}
	
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW7 bmw = new BMW7();
		bmw.desc();
		bmw.note();
		Audi7 audi = new Audi7();
		audi.desc();
		audi.note();
	}

}
