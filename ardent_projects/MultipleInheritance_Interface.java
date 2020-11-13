package ardent_projects;
interface Car12
{
	void run();
}
interface Person12
{
	void walk();
}
public class MultipleInheritance_Interface implements Car12,Person12{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance_Interface obj =new MultipleInheritance_Interface();
		obj.run();
		obj.walk();
	}

	@Override
	public void walk() {
		System.out.println("Walking");
		
	}

	@Override
	public void run() {
		System.out.println("Running");
		
	}

}
