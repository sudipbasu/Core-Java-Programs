package class_object;
class Outer{
	int a;
	public void show()
	{
		
	}
	class Inner{	//Outer$Inner.class
		public void display()
		{
			System.out.println("In Display");
		}
	}
}
public class InnerDemo {

	public static void main(String[] args) {
		
		Outer obj=new Outer();
		obj.show();
		Outer.Inner obj1=obj.new Inner();
		obj1.display();
	}

}
