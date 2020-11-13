package bbit_assignments;

import java.util.Scanner;
public class maxmin {

	int a[]=new int[5];
	int i,temp,max,min;
	
	Scanner ob=new Scanner(System.in);
	public void calculate() {
		
		
		System.out.println("Enter 5 nos in the array");
		
		for(i=0;i<a.length;i++)
		{
			
			a[i]=ob.nextInt();
		}
		

		temp=a[0];
		for(i=1;i<5;i++)
		{
			if(temp<a[i])
				temp=a[i];
			
			
			
		}
		
		max=temp;
		
		temp=a[0];
		
		
		for(i=1;i<5;i++)
		{
			if(temp>a[i])
				temp=a[i];
			
			
			
		}	
		
		min=temp;
		
	
	}
	
	public void display()
	{
		
		System.out.println("The max value is"+max);
		System.out.println("The min value is"+min);
	}
	
	
	
	
	public static void main(String[] args) {
		maxmin ob=new maxmin();
		ob.calculate();
		ob.display();

	}

}