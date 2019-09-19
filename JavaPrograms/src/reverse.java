

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Akash";
		String reversename="";
		int len=name.length();
		char[] Array=name.toCharArray();
		for(int i=Array.length-1;i>=0;i--) {
			reversename=reversename+Array[i];
		}
		System.out.println(reversename);
		for(int j=name.length()-1;j>=0;j--) {
			System.out.print(name.charAt(j));
		}
		System.out.println();
		int num=123;
		while(num>0) {
			int rem=num%10;
			num=num/10;
			System.out.print(rem);
		}
		
	}

}
