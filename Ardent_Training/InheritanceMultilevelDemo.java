package Ardent_Training;
import java.util.Scanner;
class Student3
{
	Scanner sc=new Scanner(System.in);
	String name;
	float cgpa;
	void input()
	{
		System.out.println("Enter the Name:");
		name=sc.nextLine();
		System.out.println("Enter the CGPA:");
		cgpa=sc.nextFloat();
	}
	void display()
	{
		System.out.println("STUDENT NAME: "+name);
		System.out.println("STUDENT CGPA:"+cgpa);
	}
}
class Semester3 extends Student3
{
	int s1,s2,s3;
	public int  Score(int sub1,int sub2,int sub3)
	{
		s1=sub1;
		s2=sub3;
		s3=sub3;
		return (s1+s2+s3);
	}
}
class Placement3 extends Semester3
{
	static String company;
	static
	{
		company="TCS";
	}
	public void job()
	{
		System.out.println("Job:"+company);
	}
}
public class InheritanceMultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Placement3 obj=new Placement3();
			obj.input();
			obj.display();
			System.out.println("TOTAL MARKS:"+obj.Score(80, 70, 60));;
			obj.job();
	}

}
