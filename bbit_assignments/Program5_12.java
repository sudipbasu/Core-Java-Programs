package bbit_assignments;//y_find

import java.util.Scanner;

public class Program5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		
		int n;
		
		double y=1,x;
		
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		System.out.println("Enter the value of x:");
		x=sc.nextDouble();
		if(n==1)
		{
			y=1+x;
		}
		else if(n==2)
		{
			y= (1+x)/n;
		}
		else if(n==3) {
			y= 1+(Math.pow(x, n));
		}
		else if (n>3 || n<1) {
			y= 1+(n*x);
		}
		System.out.println("The value of y is "+y);

	}

}
