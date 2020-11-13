package class_object;
abstract class Bike6
{
	abstract void Start();
}
class HeroBike extends Bike6
{

	@Override
	void Start() {
		System.out.println("In HeroBike Child");
		
	}
	
}
class HondaBike extends Bike6
{

	@Override
	void Start() {
		System.out.println("In HondaBike Child");
		
	}
	
}
public class AbstractClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroBike hero = new HeroBike();
		hero.Start();
		HondaBike honda = new HondaBike();
		honda.Start();
	}

}
