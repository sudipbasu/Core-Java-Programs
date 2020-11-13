package array;

import java.util.Scanner;

public class MinMax2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		int MAX,MIN;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size:");
		n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the Elements in Matrix:");
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the value for ["+i+"]:");
			arr[i]=sc.nextInt();
		}
		System.out.println("The Array:");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		MAX=arr[0];
		MIN=arr[0];
		for(i=0;i<arr.length;i++)
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
		System.out.println();
		System.out.println("Max:"+MAX);
		System.out.println("MIN:"+MIN);
	}

}
