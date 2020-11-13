package array;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int i,n,MIN,MAX;
		System.out.println("Enter the number of Elements:");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the values in array:");
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the value for ["+i+"]:");
			arr[i]=sc.nextInt();
		}
		System.out.println("The Array:");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		//Logic
		MAX=arr[0];
		MIN=arr[0];
		for(i=0;i<n;i++)
		{
			if(arr[i]>MAX)
			{
				MAX=arr[i];
			}
			else if(arr[i]<MIN)
			{
				MIN=arr[i];
			}
		}
		System.out.println("Largest Number is "+MAX);
		System.out.println("Smallest Number is: "+MIN);
	}

}
