package class_object;
class Employee6
{
	int empid;
	String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}
public class EncapsulationDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee6 obj=new Employee6();
		obj.setEmpid(5);
		System.out.println(obj.getEmpid());
		obj.setEmpname("Sudip");
		System.out.println(obj.getEmpname());
	}

}
