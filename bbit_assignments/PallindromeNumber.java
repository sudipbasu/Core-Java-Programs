package bbit_assignments;
import java.util.*;
public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		int temp = n;
		
		while(n>0)
		{
			rem= n%10;
			sum=(sum*10)+rem;
			n/=10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is a Pallindrome Number");
		}
		else {
			System.out.println(temp+" is not a Pallindrome Number");
		}
	}

}
