package Ardent_Training; //Overriding
class Parent8
{
	public void display()
	{
		System.out.println("In Parent Class");
	}
}
class Child8 extends Parent8
{
	public void display()
	{
		super.display();
		System.out.println("In Child Class");
	}
}
public class MethodOverridingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Child8 obj= new Child8();
			obj.display();
	}

}
