package ardent_projects;
class Overloading
{
	public int add(int a,int b)
	{
		return (a+b);
	}
	public double add(double a,double b)
	{
		return (a+b);
	}
	public int add(int a,int b,int c)
	{
		return (a+b+c);
	}
}
public class MethodOverloading_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj=new Overloading();
		System.out.println(obj.add(5, 6));
		System.out.println(obj.add(5.6, 7.2));
		System.out.println(obj.add(4, 5, 6));
	}

}
