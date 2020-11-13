package class_object;
class Math
{
	int n1,n2,n3;
}
class Sum extends Math
{
	int add(int num1,int num2,int num3)
	{
		n1=num1;
		n2=num2;
		n3=num3;
		return n1+n2+n3;
	}
}
public class InheritanceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum obj=new Sum();
	int addition=	obj.add(5, 6, 7);
	System.out.println(addition);
	}

}
