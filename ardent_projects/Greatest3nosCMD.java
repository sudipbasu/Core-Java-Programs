package ardent_projects;

public class Greatest3nosCMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		if(a>b && a>c)
		{
			System.out.println(a+" is Greatest");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+ " is Greatest");
		}
		else
		{
			System.out.println(c+" is Greatest");
		}
	}

}
