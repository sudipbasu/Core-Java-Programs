package bbit_assignments;
import java.util.*;
public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size:");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements:");
			for(i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			for(i=0;i<n;i++)
			{
				sum=sum+arr[i];
			}
			for(i=0;i<n;i++)
			{
				System.out.print(arr[i]+"\t");
			}
			System.out.println("Sum: "+sum);
	}

}
