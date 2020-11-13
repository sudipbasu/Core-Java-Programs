package bbit_assignments;

import java.util.Scanner;

public class NewSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		double sum=0,i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size:");
		
		n=sc.nextInt();
		
	for(i=1;i<n;i=i+2)		
		{
			sum=sum+(i/(i+1));
		}
		System.out.println(sum);
	}

}
