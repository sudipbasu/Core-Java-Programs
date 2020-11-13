package bbit_assignments;
import java.util.Scanner;
class largest
{
	int n1,n2,n3,temp,max;
	Scanner sc=new Scanner(System.in);
	void input()
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
		temp=(n1>n2)?n1:n2;
		max=(temp>n3)?temp:n3;
	}
	public void show()
	{
		System.out.println(max+" is largest Number");
	}
}
public class Largest3nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largest l=new largest();
		l.input();
		l.calculate();
		l.show();
	}

}
