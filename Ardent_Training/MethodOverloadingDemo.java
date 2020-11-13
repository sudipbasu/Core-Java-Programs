package Ardent_Training;
class Calculator{
	public int add(int x,int y)
	{
		return(x+y);
	}
	public int add(int x,int y,int z)
	{
		return(x+y);
	}
	public double add(double x,double y)
	{
		return (x+y);
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
		int result1=obj.add(5, 6);
		System.out.println("RESULT 1--->"+result1);
		int result2= obj.add(5,6,9);
		System.out.println("RESULT 2--->"+result2);
		System.out.println("RESULT 3--->"+obj.add(5.6, 9.2));
	}

}
