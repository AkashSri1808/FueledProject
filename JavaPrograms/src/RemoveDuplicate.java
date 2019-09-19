import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Akash Srivastava";
		char [] chars=a.toCharArray();
		Set <Character> charset=new HashSet<Character>();
		for (char c:chars) {
			charset.add(c);
		}
		System.out.println(charset);
		StringBuilder sb=new StringBuilder();
		for(Character character:charset) {
			sb.append(character);
		}
		System.out.println(sb);
	}

}
