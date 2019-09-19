
public class Fibonaaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
		int num=5;
		if(num==0) {
			System.out.println("Factorial is 0");
		}
		else if(num==1) {
			System.out.println("Factorial is 1");
		}
		else {
			while(num>0) {
				fact=fact*num;
				num=num-1;
				
			}
			System.out.println("Factorial is:"+fact);
		}
	}

}
