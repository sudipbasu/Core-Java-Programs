package java_assignment_6509;
class Person
{
	
}
class Patient extends Person{
	int patient_number;
	String hospital;
	int patient_hospital_join_year;
	String patient_address;
	double patient_medical_fees;
	public void setHospital(String h)
	{
		hospital=h;
	}
	public String getHospital()
	{
		return hospital;
	}
	public void setJoiningYear(int year)
	{
		patient_hospital_join_year = year;
	}
	public int getJoiningYear()
	{
		return patient_hospital_join_year;
	}
	public void setAddress(String address)
	{
		patient_address = address;
	}
	public String getAddress()
	{
		return patient_address;
	}
}
class Money extends Patient
{
	public void setFees(double fees)
	{
		patient_medical_fees = fees;
	}
	public double getFees()
	{
		return patient_medical_fees;
	}
}
public class Module4Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p = new Patient();
		p.setHospital("AMRI");
		System.out.println(p.getHospital());
		p.setJoiningYear(2016);
		System.out.println(p.getJoiningYear());
		p.setAddress("Kolkata");
		System.out.println(p.getAddress());
		Money m =new Money();
		m.setFees(120050);
		System.out.println(m.getFees());
		
	}

}
