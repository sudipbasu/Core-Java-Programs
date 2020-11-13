package class_object;
class calculate
{
	int num1;
	int num2;
	
	public calculate()
	{
		num1=5;
		num2=5;
	}
	public calculate(int n)
	{
		num1=n;
		num2=n;
	}
	public calculate(int p,double d)
	{
		num1=p;
		num2= (int)d;
	}
	public calculate(int x,int y)
	{
		num1=x;
		num2=y;
	}
	
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate obj=new calculate(15,20);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}
