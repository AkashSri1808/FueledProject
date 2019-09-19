
public class EncapsulationPrac {
	private int EmpId;
	public void setEmpId(int Id) {
		EmpId=Id;
	}
	public int getEmpId() {
		return EmpId;
	}
	public static void main(String [] args) {
		EncapsulationPrac encp1=new EncapsulationPrac();
		encp1.setEmpId(102);
		encp1.getEmpId();
		System.out.println(encp1.EmpId);
		System.out.println(encp1.getEmpId());
	}
}
