/*
 * Logic Behind this program is 
 * 
 * n*n - 1
 */
package bbit_assignments;

import java.util.Scanner;

public class Series_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the size:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print((i*i)-1+"\t");
		}
	}

}
