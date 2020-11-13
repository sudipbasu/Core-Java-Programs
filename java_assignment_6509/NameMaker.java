package java_assignment_6509;

import java.util.Scanner;

public class NameMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Name : ");
		String firstName = sc.nextLine();
		System.out.println("Enter Middle Name : ");
		String middleName = sc.nextLine();
		System.out.println("Enter Last Name : ");
		String lastName = sc.nextLine();
		String fullName = (firstName+" ".concat(middleName)+" ".concat(lastName));
		System.out.println("Full Name : "+fullName);
		System.out.println("Full Name in Upper Case Latters : "+fullName.toUpperCase());
		System.out.println("Full Name in Lower Case Latters : "+fullName.toLowerCase());
		System.out.println("Number of Characters of Full Name : "+fullName.length());
	}

}
