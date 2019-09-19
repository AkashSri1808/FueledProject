import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sequ= {1,2,3,4,5};
		List<Integer> seqlist=new ArrayList<Integer>();
		for (int i : sequ)
		{
			seqlist.add(i);
		}
		Collections.sort(seqlist);
		int secon=seqlist.size()-2;
		int num=seqlist.get(secon);
		System.out.println(num);
		
		
	}

}
