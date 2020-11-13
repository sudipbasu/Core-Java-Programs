package class_object;
class MyStudent
{
	 private int id;
	private String name;
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
}
public class EncapsulationDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStudent obj1=new MyStudent();
		obj1.setid(5);
		System.out.println(obj1.getid());
		obj1.setname("Name");
		System.out.println(obj1.getname());
	}

}
