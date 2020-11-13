package greatest_3_numbers;
import java.util.Scanner;
public class Greatest_among_three_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int b=sc.nextInt();
		System.out.println("Enter the Third Number:");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.printf("%d is Greatest",a);
		}
		else if(b>a && b>c)
		{
			System.out.printf("%d is Greatest",b);
		}
		else
		{
			System.out.printf("%d is Greatest",c);
		}

	}

}
