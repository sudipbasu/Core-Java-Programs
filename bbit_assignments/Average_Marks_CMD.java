package bbit_assignments;

public class Average_Marks_CMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum=0;
		float average;
		
		for(i=0;i<args.length;i++)
		{
			
			sum = sum +Integer.parseInt(args[i]);
		}
		System.out.println("Total Marks: "+sum);
		average=sum/3;
		System.out.println("Average Marks: "+average);
	}

}
