package bbit_assignments;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rem,temp;
		int c =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		n=sc.nextInt();
		
		temp=n;
		
		while(n!=0)
		{
			rem=n%10;
			n/=10;
			 c= c+ (rem*rem*rem);
		}
		if(temp==c)
		{
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
		
	}

}
