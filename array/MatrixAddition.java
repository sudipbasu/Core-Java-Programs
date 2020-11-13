package array;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[][]=new int[10][10];
			int b[][]=new int[10][10];
			int c[][]=new int[10][10];
			int i,j,n,n1;
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter the number of Rows:");
			n=sc.nextInt();
			System.out.print("Enter the number of Columns:");
			n1=sc.nextInt();
			System.out.println("Enter the Elements in First Matrix:");
			for(i=0;i<n;i++)
			{
				for(j=0;j<n1;j++)
				{
					System.out.print("Enter the value of ["+i+"]["+j+"]:");
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the Elements in Second Matrix:");
			for(i=0;i<n;i++)
			{
				for(j=0;j<n1;j++)
				{
					System.out.print("Enter the value of ["+i+"]["+j+"]:");
					b[i][j]=sc.nextInt();
				}
			}
			System.out.println("The First Matrix:");
			for(i=0;i<n;i++)
			{
				for(j=0;j<n1;j++)
				{
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("The Second Matrix:");
			for(i=0;i<n;i++)
			{
				for(j=0;j<n1;j++)
				{
					System.out.print(b[i][j]+"\t");
				}
				System.out.println();
			}
			for(i=0;i<n;i++) //Addition Operation
			{
				for(j=0;j<n1;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			System.out.println("The Addition of both of Matrices:");
			for(i=0;i<n;i++)
			{
				for(j=0;j<n1;j++)
				{
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
	}

}
