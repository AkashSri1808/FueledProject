
public class BinaryLateral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***** Binary to Decimal *******/
		String i="110001110";
		System.out.println(i);
		System.out.println(Integer.parseInt(i,2));
		System.out.println(Integer.parseInt(i,10));
		
		System.out.println("**********************************************************");
	//	System.out.println(Integer.parseInt(i,15));
		
		
		/*******Decimal to Binary Octal Hex ******/
		int j=5;
		System.out.println(Integer.toBinaryString(j));
		System.out.println(Integer.toOctalString(j));
		System.out.println(Integer.toHexString(j));
		System.out.println(i+Integer.toHexString(j));
		System.out.println("**********************************************************");
		
		
	}

}
