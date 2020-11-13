//Accepting radius and printing the area,circumference and diameter of a circle
package bbit_assignments;
import java.util.Scanner;
class cir{
	double r,circumference,area,diameter;
	Scanner sc = new Scanner(System.in);
	public void input()
	{
		
		System.out.print("Enter the Radius:");
		r=sc.nextDouble();
		area=Math.PI * Math.pow(r, 2);
		circumference= 2 * Math.PI * r;
		diameter=2 * r;
	}
	public void display()
	{
		System.out.println("The Area of the Circle is "+area);
		System.out.println("The Circumference of the Circle is "+circumference);
		System.out.println("The Diameter of the Circle is "+diameter);
	}
}
public class Circle_cal {

	public static void main(String[] args) {
		
		cir obj=new cir();
		obj.input();
		obj.display();
	}

}
