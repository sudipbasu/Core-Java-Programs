package array; //Coded by Sudip Basu
import java.util.Scanner;
public class Transpose_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[10][10];
		int tran[][]=new int[10][10];
		int i,j;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number of Rows:");
			int n= sc.nextInt();
			System.out.print("Enter the number of Columns:");
			int n1=sc.nextInt();
			System.out.println("Enter the Elements in Matrix:");
			for(i=0;i<n;i++)
			{
				for(j=0;j<n1;j++)
				{
					System.out.print("Enter the value for ["+i+"]["+j+"]:");
					arr[i][j]=sc.nextInt();
				}
			}
			System.out.println("The Matrix");
			for(i=0;i<n;i++)
			{
				for(j=0;j<n1;j++)
				{
					System.out.print(arr[i][j]+"\t");
					
				}
				System.out.println();
			}
			//calculating transpose
			
			for(i=0;i<n;i++)
			{
				for(j=0;j<n1;j++)
				{
					tran[j][i]=arr[i][j];
				}
			}
			System.out.println("Transpose of The Matrix:");
			for(i=0;i<n1;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(tran[i][j]+"\t");
				}
				System.out.println("");
			}
	}

}
