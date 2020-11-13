package abstraction_interface;
interface Car6
{
	void start();
}
interface Person6
{
	void walk();
}
class myCar implements Car6,Person6
{

	@Override
	public void start() {
		System.out.println("Car is Starting");
		
	}

	@Override
	public void walk() {
		System.out.println("Person is Walking");
		
	}
	
}
public class Interfaces2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myCar obj =new myCar();
		obj.start();
		obj.walk();
	}

}
