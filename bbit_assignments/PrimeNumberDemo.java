package bbit_assignments;

import java.util.Scanner;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n,i,flag=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			n=sc.nextInt();
			if(n==0||n==1)
			{
				System.out.println(n+" is not a Prime Number");
			}
			else
			{
				for(i=2;i<n;i++)
				{
					if(n%i==0)
					{
						System.out.println(n+" is not a Prime Number");
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.println(n+" is a Prime Number");
				}
			}
	}

}
