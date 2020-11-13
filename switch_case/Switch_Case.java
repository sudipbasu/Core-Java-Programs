package switch_case;
import java.util.Scanner;
public class Switch_Case {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Addition\nPress 2 for Substraction\nPress 3 for Multiplication\nPress 4 for Division"
				+ "\nPress 5 for Exit\nEnter Your Choice:");
		int id=sc.nextInt();
		switch(id)
		{
		case 1:
			System.out.println("Enter the First Number:");
			int a=sc.nextInt();
			System.out.println("Enter the Second Number:");
			int b=sc.nextInt();
			System.out.printf("%d+%d=%d",a,b,a+b);
			break;
		case 2:
			System.out.println("Enter the First Number:");
			int c=sc.nextInt();
			System.out.println("Enter the Second Number:");
			int d=sc.nextInt();
			System.out.printf("%d-%d=%d",c,d,c-d);
			break;
		case 3:
			System.out.println("Enter the First Number:");
			int e=sc.nextInt();
			System.out.println("Enter the Second Number:");
			int f=sc.nextInt();
			System.out.printf("%d*%d=%d",e,f,e*f);
			break;
		case 4:
			System.out.println("Enter the First Number:");
			int g=sc.nextInt();
			System.out.println("Enter the Second Number:");
			int h=sc.nextInt();
			float div=g/h;
			System.out.printf("%d*%d=%f",g,h,div);
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Wrong Option");
		}
	}

}
