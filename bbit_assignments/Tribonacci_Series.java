/*
 * implementation of Tribonacci Number Sequence in Java
 * 0 , 1 , 2, 3, 6, 11, 20, 37, 68, 125	.......
 */
package bbit_assignments; 

public class Tribonacci_Series {
	void tribo(int n)
	{
		int n1=0;
		int n2=1;
		int n3=2;
		System.out.print(n1+"\t"+n2+"\t"+n3+"\t");
		for(int i=4;i<=n;i++)
		{
			int n4=n1+n2+n3;
			System.out.print(n4+"\t");
			n1=n2;
			n2=n3;
			n3=n4;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tribonacci_Series obj=new Tribonacci_Series();
		obj.tribo(15);
		
	}

}
