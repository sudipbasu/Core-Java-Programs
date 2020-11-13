package bbit_assignments;
import java.util.Scanner;
public class Fibonacci_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Size:");
			int size=sc.nextInt();
			System.out.println("Fibonacci Sequence upto "+size+" Series:");
			if(size==1)
			{
				System.out.println(n1);
			}
			else {
			System.out.print(n1+"\t"+n2+"\t");
			for(int i=3;i<=size;i++)
			{
				n3=n1+n2;
				System.out.print(n3+"\t");
				n1=n2;
				n2=n3;
			}
			}
	}

}
