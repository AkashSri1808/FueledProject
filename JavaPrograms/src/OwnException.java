
public class OwnException extends Exception {
	
	static class MyException extends Exception{
		public MyException(String args) {
			super(args);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		try {
			if(i<10) {
				throw new MyException("Own Error");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
