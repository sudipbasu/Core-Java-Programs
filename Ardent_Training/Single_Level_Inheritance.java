package Ardent_Training;//implementation of Single Level Inheritance
class Parent{
	public int a=25;
}
class Child extends Parent{
	public int b=60;
	public void add(){
		int c=a+b;
		System.out.println("Addition:"+c);
		
	}
}
public class Single_Level_Inheritance {

	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.add();
	}

}
