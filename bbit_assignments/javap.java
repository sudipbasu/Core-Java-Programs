package bbit_assignments;

import java.util.*;
class javap
{
	public void five_digit()
	{
		
		
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter a five digit number: ");
		int n=sc.nextInt();
		System.out.println("The digits are..");
		
		for(int i=0;n>0;i++)
		{
			
			a[i]=n%10;
			n=n/10;
		
			
		}
		
		
		for(int i=4;i>=0;i--)
		{
			System.out.printf(a[i]+"\t");		
		}
		
		
	}
	
		
	
	
	public static void main(String args[]) 
	{
	javap ob=new javap();
	ob.five_digit();
	}
}