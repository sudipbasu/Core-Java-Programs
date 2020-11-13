package bbit_assignments;

import java.util.Scanner;

class LinearSearch6
{
	int n,flag=0;
	int i;
	Scanner sc=new Scanner(System.in);
	public void func(int item)
	{
		System.out.println("Enter the Size:");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements in Matrix:");
		for(i=0;i<arr.length;i++)
		{
			System.out.print("Enter the value for ["+i+"]:");
			arr[i]=sc.nextInt();
		}
//		System.out.println("Enter the element to search:");
//		int item=sc.nextInt();
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
			System.out.println(item+" is found in the location "+(i+1));
		}
		else
		{
			System.out.println(item+" is not found");
		}
	}
}
public class LinearSearchClass {
	public static void main(String args[])
	{
		LinearSearch6 obj=new LinearSearch6();
		obj.func(5);
	}

}
