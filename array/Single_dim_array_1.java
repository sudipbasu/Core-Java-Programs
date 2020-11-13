package array;
import java.util.Scanner;
public class Single_dim_array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int [50];
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Size of the array:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the value for ["+i+"]:");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The Array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
			
		}
	}

}
