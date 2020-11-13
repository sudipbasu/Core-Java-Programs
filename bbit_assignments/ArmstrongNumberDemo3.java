package bbit_assignments;

import java.util.Scanner;

class Armstrong5
{
	void func(int n)
	{
		int rem,c=0,temp;
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			c=c+(rem*rem*rem);
		}
		if(temp==c) {
			System.out.println(temp+" is Armstrong Number");
		}
		else {
			System.out.println(temp+" is not a Armstrong Number");
		}
	}
}
public class ArmstrongNumberDemo3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		Armstrong5 obj =new Armstrong5();
		obj.func(num);
	}

}
