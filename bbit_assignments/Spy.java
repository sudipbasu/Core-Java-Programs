package bbit_assignments;
import java.util.*;
class spynumber
{
	Scanner sc= new Scanner(System.in);
	int rem,n,sum=0,product=1,temp;
	void func()
	{
		System.out.println("Enter the number:");
		n=sc.nextInt();
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			
			n=n/10;
		}
		
		System.out.println("Sum="+sum);
		System.out.println("Product="+product);
	}
}
public class Spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spynumber obj=new spynumber();
		obj.func();
	}

}
