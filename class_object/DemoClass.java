package class_object;
class student
{
	int id;
	String name;
}
public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student();
		s1.id=10;
		s1.name="Sudip";
		System.out.println("Roll= "+s1.id+" Name= "+s1.name);
	}

}
