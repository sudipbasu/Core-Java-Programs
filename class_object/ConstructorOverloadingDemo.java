package class_object;
class Con_Ove
{
	int num1;
	int num2;
	String operation;
public Con_Ove()
{
	num1=0;
	num2=0;
	operation="Nothing";
	
}
public Con_Ove(int i)
{
	num1=i;
	num2=0;
	operation="Nothing";
}
public Con_Ove(int i,int j, String op)
{
	num1=i;
	num2=j;
	operation=op;
}
}
public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Con_Ove obj=new Con_Ove(4,5,"String");
		System.out.println(obj.num1);
		System.out.println(obj.num2);
				System.out.println(obj.operation);
	}

}
