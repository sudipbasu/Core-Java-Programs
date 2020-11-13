package class_object;
class MyCasio{
	public void mul(int a,int b)
	{
		System.out.println("Multiplication: "+a*b);
	}
	public void mul(float x, float y)
	{
		System.out.println("Multiplication: "+x*y);
	}
	public void mul(double p,double q)
	{
		System.out.println("Multiplication: "+p*q);
	}
}
public class Method_Overloading_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCasio obj=new MyCasio();
		obj.mul(5,6);
		obj.mul(5.2, 8.6);
		obj.mul(5.669, 8.147);
	}

}
