package class_object;

class Casio
{
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public void add(int m, int n,int f)
	{
		System.out.println(m+n+f);
	}
	public void add(double x,double y)
	{
		System.out.println(x+y);
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casio obj=new Casio();
		System.out.print("Where argument is (int i,int j):");
		obj.add(5, 6);
		System.out.print("Where argument is (int m,int n,int f):");
		obj.add(8,5,2);
		System.out.print("Where argument is (double x,double y):");
		obj.add(6.8,5.2);
	}

}
