package bbit_assignments;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i,j,n,k=1;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Size:");
			n=sc.nextInt();
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print("\t"+k++);
				}
				System.out.println();
			}
	}

}
