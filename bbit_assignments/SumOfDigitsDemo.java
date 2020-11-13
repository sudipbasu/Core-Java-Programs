package bbit_assignments;
import java.util.*;
class sod{
	int rem,sum;
	void cal(int n)
	{
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of Digits:"+sum);
	}
}
public class SumOfDigitsDemo {

	public static void main(String[] args) {
		
		sod obj=new sod();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
				obj.cal(num);
	}

}
