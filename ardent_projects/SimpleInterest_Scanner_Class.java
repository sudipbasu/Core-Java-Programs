package ardent_projects;
import java.util.Scanner;
public class SimpleInterest_Scanner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double p,r,t,i;
		System.out.println("Enter the Principle:");
		p=sc.nextDouble();
		System.out.println("Enter the Rate of Interest:");
		r=sc.nextDouble();
		System.out.println("Enter the Time in Year:");
		t=sc.nextDouble();
		i=((p*r*t)/100);
		System.out.println("Interest: "+i);
	}

}
