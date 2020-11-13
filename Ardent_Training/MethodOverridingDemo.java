package Ardent_Training;
class Parent6{
	public void show()
	{
		System.out.println("In Parent Class");
	}
}
class Child6 extends Parent6
{
	public void show()
	{
		System.out.println("In Child Class");
		super.show();
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		Child6 obj=new Child6();
		obj.show();
	}

}
