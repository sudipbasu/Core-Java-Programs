
package ardent_projects;
class  Rectangle
{
	int length;
	int breadth;
	public Rectangle(int l,int b)
	{
		length =l;
		breadth=b;
		public void area()
		{
			length =l;
			breadth=b;
		System.out.println("AREA:"+(length*breadth));
		
		}
		public void perimeter()
		{
	
			System.out.println("PERIMETER:"+2*(length*breadth));
		}
	}
}
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(5,6);
	
	}

}
