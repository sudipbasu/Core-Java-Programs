package Ardent_Training;
class Shape6
{
	public void Area(int breadth,int height)
	{
		System.out.println("Area of Triangle:"+(breadth*height)/2);
	}
	public void Area(double length,double width)
	{
		System.out.println("Area of Rectangle:"+(width*length));
	}
	public void Area(int a)
	{
		System.out.println("Area of Square:"+Math.sqrt(a));
	}
}

public class MethodOverloadingArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape6 obj=new Shape6();
		obj.Area(5, 6);
		obj.Area(5.6,8.9);
		obj.Area(7);
	}

}
