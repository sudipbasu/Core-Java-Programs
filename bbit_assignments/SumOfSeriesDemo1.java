//1  12    123    1234 ………… upto n terms
package bbit_assignments;

import java.util.*;
public class SumOfSeriesDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		
		int n,i,sum=0;
		
		System.out.print("Enter the value of n:");
		
		n=obj.nextInt();
		
		i=1;
		
		while(i<=n)
		{
			sum=sum+sum*10+i;
			
			i++;
			
		}
		
		System.out.println("The value of sum is "+sum);
		
		
		
		
		
		
	}

}
