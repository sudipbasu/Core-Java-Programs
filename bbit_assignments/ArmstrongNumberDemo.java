package bbit_assignments;
class Armstrong
{
	int rem,c;
	int num;
	void func(int n)
	{
		num=n;
		while(n>0)
		{
			rem=num%10;
			num=num/10;
			c=c+(rem*rem*rem);
		}
		if(num==c)
		{
			System.out.println(num+" is a Armstrong Number");
		}
		else
		{
			System.out.println(num+" is not Armstrong Number");
		}
	}
}
public class ArmstrongNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong obj=new Armstrong();
		obj.func(153);
	}

}
