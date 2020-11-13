package number_table;
import java.util.Scanner;
public class Number_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,i;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		int n= sc.nextInt();
		for(i=1;i<=10;i++)
		{
			m=n*i;
			System.out.println(n+"*"+i+"="+m);
		}

	}

}
