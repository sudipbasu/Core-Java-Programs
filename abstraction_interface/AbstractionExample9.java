package abstraction_interface;
abstract class Superman
{
	abstract void Laugh();
}
abstract class Batman extends Superman
{
	abstract void Fly();
}
public class AbstractionExample9 extends Batman{

	public static void main(String[] args) {
		
		AbstractionExample9 obj =new AbstractionExample9();
		obj.Fly();
		obj.Laugh();
	}

	@Override
	void Fly() {
		System.out.println("Batman is Flying");
		
	}

	@Override
	void Laugh() {
		System.out.println("Superman is Laughing");
		
	}

}
