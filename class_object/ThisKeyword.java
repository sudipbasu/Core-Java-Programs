package class_object;
class number
{
	int num1;
	int num2;
	public number(int num1,int num2)
	{
		this.num1=num1; //this var represents current object
		this.num2=num2;
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number obj=new number(5,8); //Constructor
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}
