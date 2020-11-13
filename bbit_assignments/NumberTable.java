package bbit_assignments;
import java.util.Scanner;
public class NumberTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,m,i;
		System.out.println("Enter the Number:");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			m=n*i;
			System.out.println(n+" * "+i+" = "+m);
		}
	}

}
