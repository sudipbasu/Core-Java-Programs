package class_object;
class A
{
	public void show()
	{
		System.out.println("In A");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("In B");
	}
	public void config()
	{
		System.out.println("In Config");
	}
}
class C extends A
{
	public void show() {
		System.out.println("In C");
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new B(); //RunTime Polymorphism
		obj.show();
		//obj.config();
		obj=new C();
		obj.show();  //Dynamic Method Dispatch
		
	}

}
