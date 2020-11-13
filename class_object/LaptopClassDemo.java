package class_object;
import java.util.Scanner;
class Laptop{
	String name;
	String processor;
	int ram;
	int price;
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Name of the Laptop:");
		name=sc.nextLine();
		System.out.print("Enter the Processor:");
		processor=sc.nextLine();
		System.out.print("Enter the Size of the Ram:");
		ram=sc.nextInt();
		System.out.print("Enter the Price of the Laptop:");
		price=sc.nextInt();
	}
	public void putdata()
	{
		System.out.println("Laptop Name: "+name);
		System.out.println("Processor: "+processor);
		System.out.println("Ram:"+ram+"gb");
		System.out.println("Price:"+price);
	}
}
public class LaptopClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop obj=new Laptop();
		obj.getdata();
		obj.putdata();

	}

}
