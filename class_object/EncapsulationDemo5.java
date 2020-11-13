package class_object;
class Student12
{
	String sname;
	int sroll;
	String scollege;
	String sreg;
	String sperformence;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSroll() {
		return sroll;
	}
	public void setSroll(int sroll) {
		this.sroll = sroll;
	}
	public String getScollege() {
		return scollege;
	}
	public void setScollege(String scollege) {
		this.scollege = scollege;
	}
	public String getSreg() {
		return sreg;
	}
	public void setSreg(String sreg) {
		this.sreg = sreg;
	}
	public String getSperformence() {
		return sperformence;
	}
	public void setSperformence(String sperformence) {
		this.sperformence = sperformence;
	}
	
}
public class EncapsulationDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student12 ob =new Student12();
		ob.setSname("Sudip");
		ob.setSroll(16);
		ob.setScollege("BBIT");
		ob.setSreg("D181902025");
		ob.setSperformence("Outstanding");
		System.out.println(ob.getSname());
		System.out.println(ob.getSroll());
		System.out.println(ob.getScollege());
		System.out.println(ob.getSreg());
		System.out.println(ob.getSperformence());

	}

}
