import java.util.Arrays;

public class replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1="03-03-abv";
		String b1=a1.replace("03", "rt");
		System.out.println(b1);
		int [] na= {2,1,3,8,4};
		int [] newna = null;
		Arrays.sort(na);
		int i=0;
		for(int num:na) {
			System.out.println(num);
			
		}
		System.out.println(na);
		
		char [] c1= {'a','b','c'};
		char [] c2= {'b','c','a'};
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(c2);
		if(Arrays.equals(c1, c2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		int num=153;
		int o=(int)Math.log10(num)+1;
		System.out.println((int)Math.log10(num)+1);
		System.out.println((int)Math.pow(2, o));
	}
	

}
