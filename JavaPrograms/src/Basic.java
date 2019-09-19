
public class Basic {
	public Basic(int a,int b) {
		System.out.println(a);
		System.out.println(b);
	}
	public Basic(String a) {
		
	}
	static int i=89;
	static String a;
	
	public void display(int i,String a) {
		System.out.println(i + " "+ a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(i);
		System.out.println(a);
		Basic base=new Basic(2,3);
		i=90;
		System.out.println(i);
		base.display(90, "akassh");
	}

}
