package bbit_assignments;
class Small3nos{
	void func(int a,int b,int c){
		if(a<b && a<c)
		{
			System.out.println(a+" is the Smallest Number");
		}
		else if(b<a && b<c) {
			System.out.println(b+" is the Smallest Number");
		}
		else
		{
			System.out.println(c+" is the Smallest Number");
		}
	}
}
public class Smallest3nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Small3nos obj=new Small3nos();
		obj.func(4, 5, 6);
	}

}
