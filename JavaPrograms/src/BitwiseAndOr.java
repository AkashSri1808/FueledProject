
public class BitwiseAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * convert 25 in bit 11001
		 * convert 15 in bit 01111
		 * And operator      01001(9)
		 * Or operator       11111(31)
		 */
		int a=25;
		int b=15;
		int c=a & b;
		int d=a | b;
		System.out.println(c);
		System.out.println(d);
	}

}
