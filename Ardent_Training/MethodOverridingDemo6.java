package Ardent_Training;
class ParentClass
{
	public void show()
	{
		System.out.println("In Parent Class");
	}
}
class ChildClass extends ParentClass
{
	public void show()
	{
		System.out.println("In Child Class");
		super.show();
	}
	
}
public class MethodOverridingDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj=new ChildClass();
		obj.show();
		
	}

}
