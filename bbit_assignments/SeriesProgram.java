package bbit_assignments;
import java.util.Scanner;
public class SeriesProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,id,k=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to print 1st Pattern\nEnter 2 to print 2nd Pattern");
		System.out.println("Enter your choise:");
		id=sc.nextInt();
		switch(id)
		{
		case 1:
		System.out.println("Enter the Size:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print((i*i)-1+"\t");
		}
		break;
		case 2:
			System.out.println("Enter the Size:");
			n=sc.nextInt();
			for(i=1;i<=n;i++)
			{
				if(i%2==0)
				{
					System.out.print(k+"\t");
				}
				else
				{
					System.out.print(-k+"\t");
				}
				k=k+2;
			}
			break;
			default:
				System.out.println("Wrong Choise");
		}
	}

}
