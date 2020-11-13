package bbit_assignments;

import java.util.Scanner;

public class Series_Menu_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i,n,id,sum=0,k=2;
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter 1 for First Series\nEnter 2 for Second Series\nEnter 3 for Third Series");
			System.out.println("Enter your Choise:");
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
				for(i=1;i<=n;i+=2)
				{
					sum=sum+(i/(i+1));
				}
				System.out.println("Sum Of the Series: "+sum);
				break;
			case 3:
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
					k+=2;
				}
				break;
				default:
					System.out.println("Wrong Choise");
			}
			
	}

}
