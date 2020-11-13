package factorialUserInput; //Factorial Number Implementation In Java Programming
import java.util.Scanner;
public class FactorialUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.printf("%d!=%d",n,fact);

	}

}
