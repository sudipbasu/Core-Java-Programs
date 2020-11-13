package class_object;
class calc8
{
	public int add(int ...n)
	{
//		return a+b;
		int sum=0;
		for(int i : n)
		{
			sum=sum+i;
		}
		return sum;
	}
}
public class VaragsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc8 obj=new calc8();
		System.out.println(obj.add(5, 6,3,4,5,6));
	}

}
