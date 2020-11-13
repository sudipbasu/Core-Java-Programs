package scannerUserInput;
import java.util.Scanner;
public class ScannerUserINput {

	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Integer");
		int x=sc.nextInt();
		System.out.println(x);
		System.out.println("Enter the double:");
		double y=sc.nextDouble();
		System.out.println(y);
		
	}
}
