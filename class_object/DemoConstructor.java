package class_object;
class NumClass
{
	int n;
	int n1;
	public NumClass(int x,int y)
	{
		n=x;
		n1=y;
	}
}
public class DemoConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumClass obj=new NumClass(5,6);
		System.out.println(obj.n);
		System.out.println(obj.n1);
	}

}
