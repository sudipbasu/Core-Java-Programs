package bbit_assignments;

public class G4nos_CMD {

	public static void main(String[] args) {
		
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d =Integer.parseInt(args[3]);
		int t1 = (a>b)?a:b;
		int t2 = (c>d)?c:d;
		int great = (t1>t2)?t1:t2;
		System.out.println("Greatest Number is "+great);
		

	}

}
