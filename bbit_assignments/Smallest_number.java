package bbit_assignments;
import java.util.Scanner;
class smallest
{
	int n1,n2,n3,min,temp;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.print("Enter First Number:");
		n1=sc.nextInt();
		System.out.print("Enter Second Number:");
		n2=sc.nextInt();
		System.out.print("Enter Third Number:");
		n3=sc.nextInt();
	}
	public void calculate()
	{
		temp=(n1<n2)?n1:n2;
		min=(temp<n3)?temp:n3;
	}
	public void display()
	{
		System.out.println("Smallest number is "+min);
	}
}
public class Smallest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smallest obj=new smallest();
		obj.input();
		obj.calculate();
		obj.display();
	}

}
