package ardent_projects;
class Area
{
	public Area(int base,int height)
	{
		System.out.println("Area Of Triangle=="+(0.5*base*height));
	}
	public Area(int radius)
	{
		System.out.println("Area of Circle=="+(Math.PI*radius*radius));
	}
	public Area(double width,double height)
	{
		System.out.println("Area of Reacangle=="+(width*height));
	}
	
}
public class ConstructorOverloading_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area obj=new Area(5,6);
	}

}
