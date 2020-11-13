package class_object;
class democlass
{
		int sub1,sub2,sub3;
				public int score(int s1,int s2,int s3)
				{
					sub1=s1;
					sub2=s2;
					sub3=s3;
					return (s1+s2+s3);
				}
}
public class ClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			democlass obj=new democlass();
			int total=obj.score(5, 6, 7);
			System.out.println(total);
	}

}
