//Encapsulation -> Binding Data With methods
package class_object;
class Student7
{
	private int Rollno;
	private String Name;
	public void setRollno(int r)
	{
		Rollno=r;
	}
	public int getRollno()
	{
		return Rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student7 obj=new Student7();
		obj.setRollno(5);
		System.out.println("Roll No:"+obj.getRollno());
		obj.setName("Sudip");
		System.out.println(obj.getName());
		
	}

}
