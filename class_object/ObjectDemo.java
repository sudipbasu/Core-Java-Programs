package class_object;

class calc{
	int num1;
	int num2;
	int result;
	public void perform()
	{
		result=num1+num2;
	}
}
public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			calc obj=new calc();
			obj.num1=5;
			obj.num2=6;
			obj.perform();
			System.out.println(obj.result);
	}

}
