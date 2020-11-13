package class_object;
class Calculator9
{
	public int  add(int ...n)
	{
		int sum=0;
		for(int i:n)
		{
			sum=sum+i;
		}
		return sum;
	}
}
public class VarargsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator9 ob=new Calculator9();
		int addition=ob.add(5,9,8,10);
		System.out.println(addition);
	}

}
