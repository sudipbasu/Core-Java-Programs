package class_object;
class Human
{
	private String name;
	private String gender;
	private int age;
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setGender(String g)
	{
		gender=g;
	}
	public String getGender()
	{
		return gender;
	}
	public void setAge(int a)
	{
		age =a;
	}
	public int getAge()
	{
		return age;
	}
}
public class EncapsulationDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj=new Human();
		obj.setName("Sudip");
		System.out.println(obj.getName());
		obj.setGender("Male");
		System.out.println(obj.getGender());
		obj.setAge(18);
		System.out.println(obj.getAge());
	}

}
