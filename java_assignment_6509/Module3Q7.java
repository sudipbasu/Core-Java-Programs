//7. Write a program where Shape is a parent class and triangle, square and 
//circle are the derived classes but they inherit some of the same  features 
//from their parent class.(Using method overloading).
package java_assignment_6509;
class shape
{
	public void method(int i)
	{
		System.out.println("In shape class with "+i);
	}
}
class triangle extends shape
{
	public void method(int i,int j)
	{
		System.out.println("In triangle class with "+i+" and "+j);
	}
}
class square extends triangle
{
	public void method(double i) {
		System.out.println("In square class with "+i);
	}
}
class circle extends square
{
	public void method(double i,double j) {
		System.out.println("In circle class with "+i+" and "+j);
	}
}
public class Module3Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle obj =new circle();
		obj.method(5);
		obj.method(5, 6);
		obj.method(5.5);
		obj.method(5.5, 6.6);
	}

}
