import java.util.Collections;
import java.util.regex.Pattern;
import java.util.*;

public class practice {
public static String count(String s,String a[])
{
	int i,j,count=1;
	char [] a1=s.toCharArray();
	HashMap<Integer,String> hm =new HashMap<>();
	for(i=0;i<a.length;i++)
	{
		String word=a[i];
		if(word.matches("^[A-D]*$")) 
		{
		for(j=0;j<word.length()-1;j++)
		{
			char ch=word.charAt(j);
			char ch1=word.charAt(j+1);
			if(ch==ch1) {
				count=0;
				break;
			}
			else {
				count=count+1;
			}
					/*
					 * if(ch!=ch1) { count++;
					 * 
					 * } else { break; }
					 */
		}
		}
		if(count>1)
		{
			hm.put(count,word);
		}
		
			
	
		}
	
	System.out.println(hm);
	
	return (Collections.max(hm.values()));
	}
	

public static void main(String args[])
{
	String ar[]=new String[] {"XYZ","AABC","AABCDABCDA","ABABCD","XYABCD","ABCD"};
	System.out.print(practice.count("ABCD",ar));
}
}
