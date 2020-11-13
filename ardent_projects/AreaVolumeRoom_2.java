package ardent_projects;
import java.util.Scanner;
public class AreaVolumeRoom_2 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double area,w,h,volume;
		System.out.print("Enter the height of the Room:");
		h=sc.nextDouble();
		System.out.print("Enter the width of the Room:");
		w=sc.nextDouble();
		area=(w*h);
		volume=2*(h+w);
		System.out.println("Area:"+area);
		System.out.println("Volume:"+volume);
	}
}
