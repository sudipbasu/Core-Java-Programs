package bbit_assignments;

class Armstrong1
{
	int n,rem,c;
	
	void myMethod(int num)
	{
		num=n;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			c=c+(rem*rem*rem);
		}
		if(n==c)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}
public class ArmstrongNumberDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Armstrong1 obj=new Armstrong1();
			obj.myMethod(153);
	}

}
