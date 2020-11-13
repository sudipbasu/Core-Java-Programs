package Ardent_Training;

import java.util.Scanner;

class Student7
{
	Scanner sc=new Scanner(System.in);
	String sname;
	int sroll;
	float gpa;
	
	void sdetails()
	{
		System.out.println("Enter Student Name:");
		sname=sc.nextLine();
		System.out.println("Enter Roll:");
		sroll=sc.nextInt();
		System.out.println("Enter GPA:");
		gpa=sc.nextFloat();
		System.out.println("STUDENT NAME: "+sname);
		
		System.out.println("STUDENT NAME: "+sroll);
		
		System.out.println("GPA: "+gpa);
		
	}
}
class Semester7 extends Student7
{
	 public double percentage;
	 public int score(int a,int b,int c)
	 {
		 return (a+b+c);
	 }
	 
}
class College_Placement extends Semester7
{
	
	String company;
	Scanner sc= new Scanner(System.in);
	void placement()
	{
		System.out.println("Enter the Company Name:");
		company = sc.nextLine();
	}
	
}
public class Multilevel_Inheritance_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College_Placement obj=new College_Placement();
		obj.sdetails();
		double percent=obj.percentage=80.6;
		System.out.println("PERCENTAGE:"+percent);
		int total=obj.score(70, 64, 80);
		System.out.println("TOTAL SCORE: "+total);
		obj.placement();
		System.out.println("Company :"+obj.company);
		
		
	}

}
