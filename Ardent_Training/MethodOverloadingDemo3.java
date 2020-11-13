/*
 * Method Overloading 
 */
package Ardent_Training;

class Addition
{
	public int add(int a,int b)
	{
		return (a+b);
	}
	public double add(double x,double y)
	{
		return (x+y);
	}
	public int add(int p,int q,int r)
	{
		return (p+q+r);
	}
}
public class MethodOverloadingDemo3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj=new Addition();
		System.out.println("First Method--->"+obj.add(5, 6));
		System.out.println("Second Method--->"+obj.add(5.6, 9.8));
		System.out.println("Third Method--->"+obj.add(5, 6, 9));
	}

}
