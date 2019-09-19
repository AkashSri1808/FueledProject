import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.*;

public class dateformat {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String d1="03-03-1994";
		String c1=d1.replaceAll("[^0-9]", "/");
		System.out.println(c1);
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(c1);  
	    System.out.println(c1+"\t"+date1); 
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-dd-MM");
	    String strDate= formatter.format(date1);
	    System.out.println(strDate);
		
	}

}
