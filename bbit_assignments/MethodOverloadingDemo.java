package bbit_assignments;
class MyClass
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public double add(double a,double b)
	{
		return a+b;
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		
		System.out.println(obj.add(5, 6));
		
		System.out.println(obj.add(5.5, 6.6));
	}

}
