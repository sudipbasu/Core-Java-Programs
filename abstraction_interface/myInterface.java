package abstraction_interface;
interface Student7
{
	void Exam();
	void Assignment();
}
public class myInterface implements Student7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myInterface obj = new myInterface();
		obj.Exam();
		obj.Assignment();

	}

	@Override
	public void Exam() {
		System.out.println("Physics\tChemistry\tMath");
		
	}

	@Override
	public void Assignment() {
		System.out.println("P Lab\tC Lab\tM Lab");
		
	}

}
