package bbit_assignments;
import java.util.Scanner;
public class FloydsTriangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=1,n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of Rows:");
			n=sc.nextInt();
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(k+"\t");
					k++;
				}
				//k++;
				
				System.out.println();
			}
	}

}
