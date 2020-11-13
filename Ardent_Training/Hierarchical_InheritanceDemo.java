package Ardent_Training;
class Shape
{
	public void Area(double r)
	{
		
	}
}
class Circle extends Shape
{
	public void Area(double r)
	{
		System.out.println("AREA= "+Math.PI*Math.pow(r, 2));
	}
}
class Square extends Shape
{
	public void Area(double r)
	{
		System.out.println("AREA= "+r*r);
	}
}
class Triangle extends Shape
{
	public void Area(double r)
	{
		System.out.println("AREA= "+0.5*r*r);
	}
}
public class Hierarchical_InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cr=new Circle();
		cr.Area(5.6);
		Square sq=new Square();
		sq.Area(5.6);
		Triangle tr=new Triangle();
		tr.Area(5.6);
	}

}
