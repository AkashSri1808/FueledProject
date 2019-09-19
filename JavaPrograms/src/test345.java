import java.util.Arrays;
import java.util.List;

public class test345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a1= {"ABC","QWE"};
		List a3=Arrays.asList(a1);
		System.out.println(a3.get(0));
		System.out.println(a3);
		a3.remove(0);
		System.out.println(a3);
		
	}

}
