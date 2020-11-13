package bbit_assignments;

import java.util.Scanner;

class triangle
{
	
	void myMethod(int a,int b,int c)
	{
		if(a+b+c==180)
		{
			System.out.println("Triangle Possible");
			if(a<90 && b<90 && c<90)
			{
				System.out.println("Acute Angle Triangle");
			}
			else if(a==90 || b==90 || c==90)
			{
				System.out.println("Right Angled Triangle");
			}
			else if((a>90 || a<180) && (b>90 || b<180) && (c>90 || c<180))
			{
				System.out.println("Obtuse Angle Triangle");
			}
		}
		else
		{
			System.out.println("Triangle Not Possible");
		}
	}
}
public class TriangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter the First Side:");
		x=sc.nextInt();
		System.out.println("Enter the Second Side:");
		y=sc.nextInt();
		System.out.println("Enter the Third Side:");
		z=sc.nextInt();
		triangle ob=new triangle();
		ob.myMethod(x,y,z);
		
	}

}
