package java_assignment_6509;
class Student{
	String std_name;
	int std_id;
	static String std_college;
	public void display() {
		System.out.println("std_name: "+std_name);
		System.out.println("std_id: "+std_id);
		System.out.println("std_college: "+std_college);
	}
}
public class Module3Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student.std_college="Budge Budge Institute of Technology";
		s1.std_name="Sudip Basu";
		s1.std_id=16;
		s1.display();
	}

}
