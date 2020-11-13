package bbit_assignments;

import java.util.Scanner;

class quadratic
{
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	double d;
	double r1,r2;
	public void func()
	{
		System.out.println("Enter the First Number:");
		a=sc.nextInt();
		System.out.println("Enter the Second Number:");
		b=sc.nextInt();
		System.out.println("Enter the Third Number:");
		c=sc.nextInt();
		
		d=((b*b)-(4*a*c));
		if(d>=0)
		{
			r1=(-b+Math.sqrt(d))/(2*a);
			r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Roots are Real");
			System.out.println("root1:"+r1+"\t"+"root2:"+r2);
		}
		else 
		{
		System.out.println("Roots are imaginary");
		}
	}
}
public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quadratic obj=new quadratic();
		obj.func();
	}

}
