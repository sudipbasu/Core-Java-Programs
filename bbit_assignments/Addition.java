package bbit_assignments;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the First Number:");
		int a=sc.nextInt();
		System.out.print("Enter the Second Number:");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+c);
	}

}
