package bbit_assignments;

import java.util.Scanner;

public class Pattern_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int id;
		int n,i,j,k;
		System.out.println("Enter 1 for triangle pattern\nEnter 2 for inverted triangle pattern");
		System.out.println("Enter Your Choise:");
		id=sc.nextInt();
		System.out.print("Enter the number of Rows:");
		n=sc.nextInt();
		
		switch(id)
		{
		case 1:
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(i);
				}
				System.out.println("");
			}
			break;
		case 2:

			for(i=n;i>=1;i--)
				  
				  
			  {
			  
			  for(j=1;j<=n-i;j++)
			  
			  System.out.print(" ");
			  
			  
			  
			  for(k=1;k<=i;k++)
			  {
			  System.out.print(i);
			  
			  }
			  
			  System.out.println();
			  
			
		}
			break;
			default:
				System.out.println("Plz Enter a valid Option");
	}
	}
}
