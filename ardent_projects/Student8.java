package ardent_projects;
class Student6
{
	String name;
	int rollno;
	static String college;
	
	static
	{
		college="BBIT";
	}
	public void display()
	{
		System.out.println(name+"\t"+rollno+"\t"+college);
	}
}
public class Student8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student6 s1=new Student6();
		s1.name="Sudip";
		s1.rollno=16;
		s1.display();
		Student6 s2=new Student6();
		s2.name="Rahul";
		s2.rollno=18;
		s2.display();
	}

}
