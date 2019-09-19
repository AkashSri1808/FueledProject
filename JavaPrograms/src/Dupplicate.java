
public class Dupplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="akash";
		String newName="";
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				System.out.println(name.charAt(i));
				System.out.println(name.charAt(j));
				if(name.charAt(i)==name.charAt(j)) {
					
				}
				else {
					newName=newName+name.charAt(i);
					System.out.println(newName);
				}
			}
		}
		System.out.println(newName);
	}

}
