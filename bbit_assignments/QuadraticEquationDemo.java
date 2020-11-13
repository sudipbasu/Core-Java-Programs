package bbit_assignments;
import java.util.*;
class quad
{
	void func(double a,double b,double c)
	{
		double root= (Math.pow(b, 2)-(4*a*c));
		double x= ((-b)+Math.sqrt(root))/(2*a);
		double y= ((-b)-Math.sqrt(root))/(2*a);
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
	
}
public class QuadraticEquationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quad ob=new quad();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		double a=sc.nextDouble();
		System.out.println("Enter the value of b:");
		double b=sc.nextDouble();
		System.out.println("Enter the value of c:");
		double c=sc.nextDouble();
		ob.func(a, b, c);
	}

}
