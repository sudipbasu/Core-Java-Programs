//(1^1) + (2^2) + (3^3) + (4^4) + (5^5) + ... + (n^n)
package bbit_assignments;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n,i,sum=0;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the n:");
			n=sc.nextInt();
			for(i=1;i<=n;i++)
			{
				sum=sum+(i*i);
				
			}
			System.out.println("Sum of the Series : "+sum);
	}

}
