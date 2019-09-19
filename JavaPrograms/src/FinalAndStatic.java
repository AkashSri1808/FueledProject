import java.text.DecimalFormat;

public class FinalAndStatic {
	
	static int a=12;
	final double pi=3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
// this will throw error as final is non static and main is static and we can't call non static in static
//		System.out.println(t);
		FinalAndStatic fas=new FinalAndStatic();
		System.out.println(fas.pi);
		System.out.println(a+fas.pi);
		a=3;
	// as it is final we can't change its value
	//	fas.t=8;
		double area=fas.pi*Math.sqrt(a);
		DecimalFormat df = new DecimalFormat("##.###");
		System.out.println(df.format(area));
		
		
	}

}
