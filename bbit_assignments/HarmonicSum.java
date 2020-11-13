package bbit_assignments;

import java.util.Scanner;

public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n value : ");
		
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			sum=sum+(1/i);
		}
		System.out.println("Harmonic Sum upto "+n+" is : "+sum);

	}

}
