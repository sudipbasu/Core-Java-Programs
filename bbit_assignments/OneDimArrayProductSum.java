package bbit_assignments;

import java.util.Scanner;

public class OneDimArrayProductSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter the Size of the Array:");
		n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the Elements in the Array:");
		for(i=0;i<arr.length;i++)
		{
			System.out.print("Enter the value for ["+i+"]:");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The 1 Dim Array is:");
		
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		int sum=0,product=1;
		for(i=0;i<n;i++)
		{
			sum=sum+arr[i];
			product=product*arr[i];
		}
		System.out.println("Addition of the Elements: "+sum);
		System.out.println("Product of the Elements: "+product);
	}

}
