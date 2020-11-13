package ardent_projects;
import java.util.Scanner;
public class ExceptionNameRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		try
		{
			System.out.println("Enter the name : ");
			String name = sc.nextLine();
			System.out.println("Enter the roll : ");
			int roll = sc.nextInt();
			System.out.println(name+"\t"+roll);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
