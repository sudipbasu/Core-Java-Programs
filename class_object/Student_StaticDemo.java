package class_object;
class Student_class{
	int roll;
	String name;
	static String college;
	static {
		college="BBIT";
	}
	public void display()
	{
		System.out.println(name+"\t"+roll+"\t"+college);
	}
}
public class Student_StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_class sudip=new Student_class();
		sudip.name="Sudip Basu";
		sudip.roll=16;
		sudip.display();
		Student_class rahul=new Student_class();
		rahul.name="Rahul Saha";
		rahul.roll=14;
		//rahul.college="PTC";
		rahul.display();
		
	}

}
