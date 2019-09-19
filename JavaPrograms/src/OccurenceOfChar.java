import java.util.HashMap;

public class OccurenceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Akash Srivastava";
		HashMap<Character, Integer> occur=new HashMap<Character,Integer>();
		int count=1;
		for (int i=0;i< name.length()-1;i++) {
			if(occur.containsKey(name.charAt(i))) {
				
				occur.put(name.charAt(i), count++);
			}
			else {
				occur.put(name.charAt(i), 1);
			}
			
		}
		System.out.println(occur);
	}

}
