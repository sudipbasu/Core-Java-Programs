package bbit_assignments;
import java.util.*;
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows:");
		n=sc.nextInt();
		System.out.println("Enter the number of Columns:");
		n1=sc.nextInt();
		int arr[][]=new int[10][10];
		int tran[][]=new int[10][10];
		System.out.println("Enter the Elements in Matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print("Enter the value for ["+i+"]["+j+"]:");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				tran[j][i]=arr[i][j];
			}
		}
		System.out.println("The Transpose of the Matrix:");
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(tran[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
