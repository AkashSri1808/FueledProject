
public class DuplicateCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Better Butter";
		int count=0;
		for(int i=0;i<input.length();i++) {
			for(int j=i+1;j<input.length();j++) {
				if(input.charAt(i)==input.charAt(j)) {
					count=count+1;
				}
			}
			System.out.println(input.charAt(i)+":"+count);
		}
	}

}
