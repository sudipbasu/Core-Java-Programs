package Ardent_Training;
class Cal
{
	public int add(int a,int b)
	{
		return(a+b);
	}
	public float add(float c, int d)
	{
		return(c+d);
	}
	public double add(double e,double f)
	{
		return (e+f);
	}
}
public class MethodOverloadingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal obj=new Cal();
		int Sum1 =obj.add(5, 6);
		System.out.println("Sum1:"+Sum1);
		double Sum2=obj.add(5.6, 8);
		System.out.println("Sum2:"+Sum2);
	}

}
