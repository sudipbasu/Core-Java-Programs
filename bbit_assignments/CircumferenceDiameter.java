package bbit_assignments;
import java.util.Scanner;
class Circle1{
	
	void myfunction()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Radius:");
		int r=sc.nextInt();
	
		double circumference= 2*Math.PI*r;
		double diameter=2*r;
		System.out.println("Circumference="+circumference);
		System.out.println("Diameter="+diameter);
	}
}
public class CircumferenceDiameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 obj=new Circle1();
		obj.myfunction();
	}

}
