package array;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Rows:");
		n=sc.nextInt();
		System.out.print("Enter the Number of Columns:");
		n1=sc.nextInt();
		int a[][]=new int[n][n1];
		int b[][]=new int[n][n1];
		int c[][]=new int[n][n1];
		System.out.println("Enter the Elements in First Matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print("Enter the value for ["+i+"]["+j+"]:");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the Elements in Second Matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print("Enter the value for ["+i+"]["+j+"]:");
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("First Matrix:");
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Second Matrix:");
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		for(i=0;i<n;i++)//Addition Operation
		{
			for(j=0;j<n1;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("The Addition of Two Matrices");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
