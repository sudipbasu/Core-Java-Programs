package bbit_assignments;

import java.util.Scanner;

public class LinearSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,flag=0,item;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements in Array:");
		for(i=0;i<arr.length;i++)
		{
			System.out.print("Enter the value for ["+i+"]:");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the item to Search:");
		item=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(arr[i]==item)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(item+ " is found in the location "+(i+1));
		}
		else
		{
			System.out.println(item+" not Found");
		}
	}

}
