/*
 * 3)Wap to print each term of the given series:

	2 -4 6 -8 10 -12........n terms
 */
package bbit_assignments;

import java.util.Scanner;

public class SeriesDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i,n,k=2;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the Size:");
			
			n=sc.nextInt();
			
			for(i=1;i<=n;i++)
			{
				if(i%2==0)
				{
					System.out.print(-k+"\t");
				}
				else
				{
					System.out.print(k+"\t");
				}
				k+=2;
			}
	}

}
