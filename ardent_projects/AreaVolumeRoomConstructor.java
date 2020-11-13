package ardent_projects;
class MyRoom
{
	public MyRoom(double length,double height,double width)
	{
		System.out.println("Volume of the Room : "+(length*height*width));
		System.out.println("Area of the Room : "+(length*width));
	}
}
public class AreaVolumeRoomConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRoom ob=new MyRoom(5.5,5.4,6);
	}

}
