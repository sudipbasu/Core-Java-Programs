package bbit_assignments;

public class Fibonacci_Series_upto_10_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int n3;
		System.out.println("Fibonacci Series upto 10 terms:");
		System.out.print(n1+"\t"+n2+"\t");
		for(int i=3;i<=10;i++)
		{
			n3=n1+n2;
			System.out.print(n3+"\t");
			n1=n2;
			n2=n3;
		}
	}

}
