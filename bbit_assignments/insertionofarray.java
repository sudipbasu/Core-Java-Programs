package bbit_assignments;

import java.util.Scanner;
public class insertionofarray {

	public static void main(String[] args) {
	
		int array[]=new int[30];
		
		Scanner sc=new Scanner(System.in);
		int size,position,number;
		
		System.out.println("Enter the no of elements you wish to include(<=30)");
		
		size=sc.nextInt();
		
		System.out.println("Enter the values in the array");
		
		for(int i=0;i<size-1;i++)
		{
			array[i]=sc.nextInt();
			
			
			
		}
		
		System.out.println("Enter the position in which you wish to insert the number");
		position=sc.nextInt();
		System.out.println("Enter the no that you wish to insert in the array");
		number=sc.nextInt();
		
		for(int i=size-1;i>=position;i--)
		{
			array[i]=array[i-1];
			
		}
		
		array[position-1]=number;
		
		
	System.out.println("Array after insertion");	
for(int i=0;i<size;i++)
	System.out.print(array[i]+" ");
	
	
	
	
	
	
	}

}