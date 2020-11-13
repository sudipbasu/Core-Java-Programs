/*
 * Write a program where the name of the base 
 * class is  Student and have other variables as std_name,std_id, 
 * and std_college where std_college is a pplplstatic variable.
 */
package ardent_projects;
class Student{
	String std_name;
	int std_id;
	static String std_college;
//	static {
//		std_college="BBIT";
//	}
	void display()
	{
		System.out.println(std_name+" : "+std_id+" : "+std_college);
	}
}
public class Student_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.std_id=16;
		obj.std_name="Sudip Basu";
		Student.std_college=
				"BBIT"; //Static var can be access using class also
		obj.display();
	}

}
