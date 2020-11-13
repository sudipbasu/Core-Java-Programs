package ardent_projects;
class Parent6
{
	public void show()
	{
		System.out.println("In Parent Class");
	}
}
class Child6 extends Parent6
{
	public int func()
	{
		return 0;
	}
}
public class Inheritance_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child6 obj=new Child6();
		obj.show();
	}

}
