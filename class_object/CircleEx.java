//A class called circle is designed as shown in the following class diagram. It contains:
//
//    Two private instance variables: radius (of the type double) and color (of the type String), with default value of 1.0 and 
//    "red", respectively.
//    Two overloaded constructors - a default constructor with no argument, and a constructor which 
//    takes a double argument for radius.
//    Two public methods: getRadius() and getArea(), which return the radius and area of this instance, respectively.

package class_object;
class circle
{
	private double radius;
	private String color;
	public circle()
	{
		radius = 1.0;
		color="red";
	}
	public circle(double r)
	{
		radius = r;
	}
	public double getradius()
	{
		return radius;
	}
	public double getarea()
	{
		return (3.14*radius*radius);
	}
}
public class CircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			circle c=new circle(5);
			System.out.println("Area :"+c.getarea());
			System.out.println("Radius :"+c.getradius());
	}

}
