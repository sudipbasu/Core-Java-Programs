package class_object;
class Student9
{
	String name;
	int rollno;
	public void DisplayStudent()
	{
		System.out.println("Name:"+name+"\tRoll No:"+rollno);
	}
}
class Marks9 extends Student9
{
	public int score(int p,int q,int r)
	{
		return p+q+r;
	}
}
class Placement9 extends Marks9
{
	public String company()
	{
		return "TCS";
	}
}
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Placement9 obj=new Placement9();
		obj.name="Sudip";
		obj.rollno=16;
		obj.DisplayStudent();
		System.out.println("Total Marks:"+obj.score(70, 80, 90));
		System.out.println(obj.company());
	}

}
