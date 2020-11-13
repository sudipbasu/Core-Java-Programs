package class_object;
class Student20
{
	String name;
	int roll;
	static String college;
//	static {
//		college="BBIT";
//	}
	public void display() {
		System.out.println(name+"\t"+roll+"\t"+college);
	}
}
public class staticKeyword {

	public static void main(String[] args) {
		Student20.college="Budge Budge Institute of Technology";
		Student20 s =new Student20();
		s.name="Sudip Basu";
		s.roll=16;
		s.display();
		Student20 s1 = new Student20();
		s1.name="Rahul Dey";
		s1.roll=15;
		s1.display();
		Student20 s2 = new Student20();
		s2.name="Srijan Das";
		s2.roll=14;
		s2.display();
	}

}
