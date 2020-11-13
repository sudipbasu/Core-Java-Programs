package ardent_projects;
class Base
{
	public void display()
	{
		System.out.println("In Base Class");
	}
}
class Child extends Base
{
	public void display()
	{
		System.out.println("In Child Class");
		super.display();
	}
}
public class Overriding_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ob1=new Child();
		ob1.display();
	}

}
