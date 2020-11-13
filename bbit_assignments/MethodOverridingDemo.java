package bbit_assignments;
class Parent6
{
	public void display() {
		System.out.println("In Parent Class");
		
	}
}
class Child6 extends Parent6
{
	public void display() {
		System.out.println("In Child Class");
		super.display();    //By Using super keyword we can get the method of the parent class
		
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child6 obj=new Child6();
		obj.display();

	}

}
