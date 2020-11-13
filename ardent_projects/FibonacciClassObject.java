package ardent_projects;
import java.util.Scanner;
class Fibonacci
{
	Scanner sc=new Scanner(System.in);
	int size,n1=0,n2=1,n3,i;
	public void input()
	{
		System.out.println("Enter the Size:");
		 size=sc.nextInt();
	}
	public void result()
	{
		System.out.print(n1+"\t"+n2+"\t");
		for(i=3;i<=size;i++)
		{
			n3=n1+n2;
			System.out.print(n3+"\t");
			n1=n2;
			n2=n3;
		}
	}
}
public class FibonacciClassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f=new Fibonacci();
		f.input();
		f.result();
		
	}

}
