//Wap to enter 3 nos (positive or negative).If they are unequal then display the greatest no else,display they
//equal.The program also displays whether the nos entered by the user are all positive,all negative or
//combination of both.
package bbit_assignments;

import java.util.Scanner;

class newClass
{
	int n1,n2,n3;
	Scanner sc=new Scanner(System.in);
	void positiveNegative()
	
	{
		System.out.println("Enter the First Number:");
		n1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		n2=sc.nextInt();
		System.out.println("Enter the Third Number:");
		n3=sc.nextInt();
		if(n1>0 && n2>0 && n3>0)
		{
			System.out.println("All numbers are Positive");
		}
		else if(n1<0 && n2<0 && n3<0)
		{
			System.out.println("All numbers are Negative");
		}
		else
		{
			System.out.println("Both Positive and Negative numbers are present here");
		}
	}
	public void EqualUnequal()
	{
		if((n1!=n2) && (n2!=n3) && (n3!=n1))
		{
			if(n1>n2 && n1>n3)
			{
				System.out.println(n1+" is Greatest");
			}
			else if(n2>n1 && n2>n3)
			{
				System.out.println(n2+" is Greatest");
			}
			else
			{
				System.out.println(n3+" is Greatest");
			}
		}
		else
		{
			System.out.println("All numbers are Equal");
		}
	}
}
public class program3nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newClass obj=new newClass();
		obj.positiveNegative();
		obj.EqualUnequal();
	}

}
