//Wap to Accept marks in 3 subjects and calculate total and avg marks via command line arguments.

package bbit_assignments;

public class Average_CMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=0;
			for(int i=0;i<args.length;i++)
			{
				marks=marks+Integer.parseInt(args[i]);
			}
			System.out.println("Total Marks:"+marks);
			int average=marks/args.length;
			System.out.println("Average Marks:"+average);
	}

}
