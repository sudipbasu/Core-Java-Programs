package Ardent_Training;
abstract class Shape8
{
	abstract void area(double a);
	abstract void perimeter(double a);
}
class Square8 extends Shape8
{

	@Override
	void area(double a) {
		System.out.println("Area of Square : "+(a*a));
		
	}

	@Override
	void perimeter(double a) {
		// TODO Auto-generated method stub
		System.out.println("Perimater of Square : "+(4*a));
	}
	
}
class Circle8 extends Shape8
{

	@Override
	void area(double a) {
		System.out.println("Area of Circle : "+(Math.PI*a*a));
		
	}

	@Override
	void perimeter(double a) {
		System.out.println("Perimeter of Circle : "+(2*Math.PI*a));
		
	}
	
}
public class AreaPerimeterShapesAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square8 s = new Square8();
		s.area(5);
		s.perimeter(5);
		Circle8 c =new Circle8();
		c.area(6);
		c.perimeter(6);
	}

}
