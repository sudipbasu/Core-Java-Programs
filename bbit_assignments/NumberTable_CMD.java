package bbit_assignments;

public class NumberTable_CMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(args[0]);
		
		int m,i;
		
		for(i=1;i<=10;i++)
		{
			m=n*i;
			System.out.println(m+" = "+n+" * "+i);
		}

	}

}
