package primeNumber;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
			int n;
			System.out.println("Enter the number:");
			n=sc.nextInt();
			int i;
			
			for(i=2;i<n;i++)
			{
				if(n%i==0)
				{
					System.out.printf("%d is Not a prime number",n);
					break;
				}
				else
				{
					System.out.printf("%d is a prime number",n);
					break;
			}
			
			
			}
	}

}
