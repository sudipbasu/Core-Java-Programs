package array;
import java.util.Scanner;
class Search
{
	Scanner sc=new Scanner(System.in);
	int i,n,flag;
	int arr[]=new int[10];
	public void func(int n,int item)
	{
		
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the value for ["+i+"]:");
			arr[i]=sc.nextInt();
			
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]==item)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(item+" is found in the location "+(i+1));
		}
		else
		{
			System.out.println(item+" is not found");
		}
	}
}
public class LinearSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search ob=new Search();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int n=sc.nextInt();
		System.out.println("Enter the number to search:");
		int item=sc.nextInt();
		ob.func(n, item);
		
	}

}
