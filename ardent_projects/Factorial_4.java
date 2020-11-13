package ardent_projects;
import java.util.Scanner;
public class Factorial_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i,n,fact=1;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			n=sc.nextInt();
			for(i=1;i<=n;i++)
			{
				fact*=i;
			}
			System.out.println("Factorial: "+fact);
	}

}
