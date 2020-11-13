package Ardent_Training;
interface Square7
{
	void SquareArea();
	void SquarePerimeter();
}
interface Circle7
{
	void CircleArea();
	void CirclePerimeter();
}
public class AreaPerimeterShapeInterface implements Square7,Circle7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaPerimeterShapeInterface obj =new AreaPerimeterShapeInterface();
		obj.CircleArea();
		obj.CirclePerimeter();
		obj.SquareArea();
		obj.SquarePerimeter();
	}

	@Override
	public void CircleArea() {
		System.out.println("Circle Area : "+(Math.PI*5*5));
		
	}

	@Override
	public void CirclePerimeter() {
		System.out.println("Circle Perimeter : "+(2*Math.PI*5));
		
	}

	@Override
	public void SquareArea() {
		System.out.println("Square Area : "+(5*5));
		
	}

	@Override
	public void SquarePerimeter() {
		System.out.println("Square Perimeter : "+(4*5));
		
	}

}
