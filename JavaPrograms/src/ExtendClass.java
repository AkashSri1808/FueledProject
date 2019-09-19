
public class ExtendClass extends BaseClass{
	public void Extend() {
		System.out.println("In Extend");
	}
	public void display() {
		System.out.println("In extend display");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendClass ec=new ExtendClass();
		ec.Basemethod();
	//	ExtendClass ec1=new BaseClass();
		BaseClass bc=new BaseClass();
		bc.Basemethod();
		BaseClass bc1=new ExtendClass();
		bc1.Basemethod();
		bc1.display();
//		ExtendClass ec2=new BaseClass();
		
		
	}

}
