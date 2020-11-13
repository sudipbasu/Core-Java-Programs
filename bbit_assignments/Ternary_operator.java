package bbit_assignments;
import java.util.Scanner;
public class Ternary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3,n4,t1,t2,great;
		System.out.println("Enter the 4 numbers respectively:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		n4=sc.nextInt();
		t1=(n1>n2)?n1:n2;
		t2=(n3>n4)?n3:n4;
		great=(t1>t2)?t1:t2;
		System.out.println("Greatest number is "+great);
		
	}

}
