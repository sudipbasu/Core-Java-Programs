package bbit_assignments;
import java.util.Scanner;
public class prime_number1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc= new Scanner(System.in);
				for(int i=1;i<=100;i++)
				{
					if(i%i==0 || i%1==0)
					{
						System.out.print(i+"\t");
					}
				}
	}

}
