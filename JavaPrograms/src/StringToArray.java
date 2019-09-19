import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="akash";
		char [] Arrname=name.toCharArray();
		for(int i=0;i<Arrname.length;i++) {
			System.out.println(Arrname[i]);
		}
		Set<Character> Setname = new HashSet<Character>();
		for(char c:name.toCharArray()) {
			Setname.add(c);
			
		}
		System.out.println(Setname);
		String newName = "";
		for(char c:Setname){
			newName=newName+c;
		}
		System.out.println(newName);
		
	}

}
