package bbit_assignments;

public class patternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			for(int i=0;i<5;i++)
//			{
//				for(int j=0;j<i;j++)
//				{
//					System.out.print("*");
//				}
//				System.out.println();
//			}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(j%2==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}

}
