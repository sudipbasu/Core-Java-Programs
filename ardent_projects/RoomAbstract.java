//Find out area and volume of a room using the concept of abstract class.Define the method area()
//in the abstract class and define the method volume in the child class extending it.
package ardent_projects;
abstract class Room
{
	abstract void area(double l,double w);
	abstract void volume(double l,double w);
}

public class RoomAbstract extends Room{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomAbstract obj =new RoomAbstract();
		obj.area(5, 6);
		obj.volume(5.5, 6.6);
	}

	@Override
	void area(double l,double w) {
		System.out.println("Area : "+(l*w));
		
	}

	@Override
	void volume(double w,double l) {
		System.out.println("Volume : "+(2*(l+w)));
		
	}

}
