package simpleInterest;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Principal:");
		float p=sc.nextFloat();
		System.out.println("Enter the Interest Rate:");
		float r=sc.nextFloat();
		System.out.println("Enter the Time:");
		float t=sc.nextFloat();
		
		float i;
		i=((p*r*t)/100);
		
		System.out.printf("Interest= %f",i);
	}

}
