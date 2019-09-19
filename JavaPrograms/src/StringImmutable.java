
public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//debug karte hue dkhna id aur value s1 and s2 ki same hoti hai
		String s1="Java";
		String s2="Java";
		String s3=s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//debug karte hue dkhna s1 ki id aur value change ho jaega
		s1="selenium";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("*************************************");
		int a=10;
		int b=20;
		int c=a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		a=34;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("*************************************");
		System.out.println("String   StringBuffer     StringBuilder");
		String r1="abc";
		r1.concat("d");
		System.out.println(r1);
		StringBuffer r2= new StringBuffer("efh");
		r2.append("i");
		System.out.println(r2);
	}

}
