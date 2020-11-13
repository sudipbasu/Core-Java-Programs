package class_object;

class Superman
{
	int c;
	void cal(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
		
	}
}
class Batman extends Superman
{
	void display()
	{
		c=a+b;
		System.out.println("Addition="+c);
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Batman obj=new Batman();
			obj.cal(5, 6);
			obj.display();
	}

}
