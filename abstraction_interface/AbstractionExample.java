package abstraction_interface;
abstract class Jetplane{
	abstract void Fly();
}
public class AbstractionExample extends Jetplane{
	
	void Fly()
	{
		System.out.println("Jetplane is Flying");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AbstractionExample obj =new AbstractionExample();
			obj.Fly();
	}

}
