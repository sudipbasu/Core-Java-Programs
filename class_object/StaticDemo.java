package class_object;
class Emp
{
int eid;
int salary;
static String ceo;
static			//when load a class
{
	ceo="Larry";
	System.out.println("In Static Block");
}
public Emp(){			//when create an object
	eid=1;
	salary=500;
	System.out.println("In Constructor");
}
public void show()
{
	System.out.println("Employee ID\tSalary\tCEO");
	System.out.println(eid+"\t\t"+salary+"\t"+ceo);
}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp sudip=new Emp();
		//sudip.eid=8;
		//sudip.salary=200000;
		//sudip.ceo="Navin";
		Emp rahul=new Emp();
		//rahul.eid=2;
		//rahul.salary=200;
		//rahul.ceo="Mahesh";
		//rahul.ceo="Nikita";
		sudip.show();
		rahul.show();
	}

}
