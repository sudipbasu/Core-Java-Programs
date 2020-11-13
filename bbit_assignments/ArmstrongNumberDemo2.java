package bbit_assignments;
//class Arm
//{
//	int num,c=0,rem;
//	void myMethod(int n)
//	{
//		num=n;
//		while(num>0)
//		{
//			rem=num%10;
//			num=num/10;
//			c=c+(rem*rem*rem);
//		}
//		if(num==c)
//		{
//			System.out.println(num+" is Armstrong Number");
//		}
//		else
//		{
//			System.out.println(num+" is not an Armstrong Number");
//		}
//	}
//}
public class ArmstrongNumberDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Arm obj=new Arm();
//		obj.myMethod(153);
		int rem=1,n,c=0;
		n=153;
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			c=c+(rem*rem*rem);
			
		}
		if(temp==c)
		{
			System.out.println(n+"Armstrong");
		}
		else
		{
			System.out.println(n+"Not Armstrong");
		}
	}

}
