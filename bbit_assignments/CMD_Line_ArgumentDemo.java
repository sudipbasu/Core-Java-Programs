package bbit_assignments;

public class CMD_Line_ArgumentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
					for(int i=0;i<args.length ;i++)
					{
						sum = sum + Integer.parseInt(args[i]);
					}
					System.out.println("Addition"+sum);
						
	}

}
