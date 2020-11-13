package class_object; //Student Encapsulation
import java.util.Scanner;
class Student6{
	private String name;
	private int roll;
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setRoll(int r)
	{
		roll = r;
	}
	public int getRoll()
	{
		return roll;
	}
}
public class EncapsulationDemo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the Name:");
		String name1=sc.nextLine();
		System.out.println("Enter the Roll No:");
		int roll1=sc.nextInt();
		Student6 obj =new Student6();
		obj.setName(name1);
		System.out.println("Student Name : "+obj.getName());
		obj.setRoll(roll1);
		System.out.println("Student Roll No : "+obj.getRoll());
	}

}
