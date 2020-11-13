package Ardent_Training;//Method Overriding
class Bank
{
	int getrateofinterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int gaterateofinterest()
	{
		return 7;
	}
}
class ICICI extends Bank
{
	int gaterateofinterest()
	{
		return 8;
	}
}
class Axis extends Bank
{
	int gaterateofinterest()
	{
		return 9;
	}
}
public class BankMethodOverriddingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s= new SBI();
		ICICI i=new ICICI();
		Axis a=new Axis();
		
		System.out.println("SBI Rate of Interest:"+s.gaterateofinterest());
		System.out.println("ICICI Rate of Interest:"+i.gaterateofinterest());
		System.out.println("Axis Rate of Interest:"+a.gaterateofinterest());
	}

}
