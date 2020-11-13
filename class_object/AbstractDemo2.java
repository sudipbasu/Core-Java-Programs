package class_object;
abstract class Bike2
{
	abstract void myBike();
}
class Honda2 extends Bike2
{

	@Override
	void myBike() {
		System.out.println("In myBike method");
		
	}
	
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda2 h =new Honda2();
		h.myBike();
	}

}
