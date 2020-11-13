//1)to print the series
//0,3,8,15,24,........to n terms
//
//2)To print the sum of the series:
//
//S=1/2 + 3/4 + 5/6 + 7/8........+19/20
package bbit_assignments;

import java.util.Scanner;

public class SeriesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id,i,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to Print First Series\nEnter 2 to Print the 2nd Sum of the Series");
		id=sc.nextInt();
		switch(id)
		{
		case 1:
			System.out.println("Enter the n term:");
			int n=sc.nextInt();
			for(i=1;i<=n;i++)
			{
				System.out.print((i*i)-1+"\t");
			}
			break;
		case 2:
			
			for(int j=1;j<20;j+=2)
			{
				
				s=s+  (j/(j+1));
				
				
			}
			System.out.println("Sum:"+s);
			break;
		}
	}

}
