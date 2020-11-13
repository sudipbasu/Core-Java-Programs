package class_object;
class Employee{
	int salary=5000;
}
class Programmer extends Employee{
	int bonus=2000;
}
public class InheritanceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer obj=new Programmer();
		System.out.println("Salary="+obj.salary);
		System.out.println("Bonus="+obj.bonus);
	}

}
