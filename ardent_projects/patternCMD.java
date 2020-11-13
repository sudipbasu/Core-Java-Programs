package ardent_projects;

public class patternCMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i=1;i<=Integer.parseInt(args[0]);i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
