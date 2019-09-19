
public class ASCIIConversion {
	public Object first(){
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="AKASH";
		System.out.println(name.toLowerCase());
		for(int i=0;i<name.length();i++) {
			int ascii=(int)(name.charAt(i));
//			System.out.println(ascii);
			if(ascii==65) {
				
				System.out.print("a");
			}
			else {
				System.out.print(name.charAt(i));
			}
		}
	}

}
