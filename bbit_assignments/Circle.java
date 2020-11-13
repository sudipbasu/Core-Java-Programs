package bbit_assignments;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of Radius:");
		float r=sc.nextFloat();
		double diameter= 2*r;
		double circumference= 2*Math.PI*r;
		System.out.println("Diameter= "+diameter);
		System.out.println("Circumference= "+circumference);
		
	}

}
