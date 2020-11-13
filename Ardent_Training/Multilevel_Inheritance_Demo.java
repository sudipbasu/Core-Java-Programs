package Ardent_Training;
class Student{
	public int rollno=16;
	public String name="Sudip Basu";
	void show()
	{
		System.out.println("NAME:"+name);
		System.out.println("ROLL NO:"+rollno);
	}
	
}
class Subject extends Student
{
	public String sub1="Physics";
	public String sub2="Chemistry";
	public String sub3="Math";
	public int score(int p,int q,int r)
	{
		return(p+q+r);
	}
	public void display()
	{
		System.out.println("Subject1:"+sub1);
		System.out.println("Subject2:"+sub2);
		System.out.println("Subject3:"+sub3);
	}
}
class Semester extends Subject
{
	public double cgpa=7.5;
	public String sem="V";
	void details()
	{
		System.out.println("Semester:"+sem);
		System.out.println("CGPA:"+cgpa);
	}
}
public class Multilevel_Inheritance_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semester obj=new Semester();
		obj.show();
		obj.display();
		int total=obj.score(90, 80, 75);
		System.out.println("Total:"+total);
		obj.details();
	}

}
