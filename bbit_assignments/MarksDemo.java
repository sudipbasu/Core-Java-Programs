//In an Exam,grades are given to the students on the basis of average marks obtained.Wap to input
//name and average marks that displays the grade along with the name accordingly.
//
//Marks:                                     Grade
//
//
//80% and above                             Distinction
//
//60% or more but less than 80%            1st Division
//45% or more but less than 60%             Second division
//40% or more but less than 45%             Pass
//
//Less than 40%                             Fail

package bbit_assignments;
import java.util.Scanner;
class marks
{
	
	int marks;
	String grade;
	String name;
	void func(int marks)
	{
		if(marks>=80)
		{
			grade= "Distinction";
		}
		else if(marks>=60 && marks<80)
		{
			grade="1st Division";
		}
		else if(marks>=45 && marks<60)
		{
			grade="Second Division";
		}
		else if(marks>=40 && marks<45)
		{
			grade="Pass";
		}
		else if(marks<40)
		{
			grade="Fail";
		}
	}
	void display(String name)
	{
		System.out.println(name +":"+grade);
	}
	
}
public class MarksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marks obj=new marks();
		Scanner sc=new Scanner(System.in);
		int marks;
		String name;
		System.out.println("Enter the name:");
		name=sc.nextLine();
		System.out.println("Enter the Marks:");
		marks=sc.nextInt();
		obj.func(marks);
		obj.display(name);
	}

}
