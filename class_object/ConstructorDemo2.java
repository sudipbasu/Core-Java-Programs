package class_object;
class Conn
{
	int n;
	int n1;
	public Conn()
	{
		n=12;
	}
	public Conn(int p)
	{
		n=p;
	}
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conn obj=new Conn(8);
		System.out.println(obj.n);
	}

}
