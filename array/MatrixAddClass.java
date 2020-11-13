package array;
import java.util.*;
class MatrixAdd6
{
	Scanner sc =new Scanner(System.in);
	int n,n1,i,j;
	int a[][]=new int[n][n1];
	int b[][]=new int[n][n1];
	int c[][]=new int[n][n1];
	public void input()
	{
		System.out.print("Enter the number of Rows:");
		n=sc.nextInt();
		System.out.print("Enter the number of Columns:");
		n1=sc.nextInt();
		System.out.println("Enter the Elements in First Matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print("Enter the value for ["+i+"]["+j+"]:");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the Elements in Second Matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print("Enter the value for ["+i+"]["+j+"]:");
				b[i][j]=sc.nextInt();
			}
		}
	}
	public void display()
	{
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
	}
	public void matrixadd()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
			
		}
	}
	public void displayadd()
	{
		System.out.println("The Addition of Two Matrix:");
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
public class MatrixAddClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixAdd6 obj =new MatrixAdd6();
		obj.input();
		obj.display();
		obj.matrixadd();
		obj.displayadd();

	}

}
