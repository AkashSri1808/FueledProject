import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class CollectionPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrayint=new int[2];
		arrayint[0]=0;
		arrayint[1]=1;
	//	arrayint[2]=2;
	//	arrayint[3]=3;
		System.out.println(arrayint[0]+" "+arrayint[1]);
		System.out.println(arrayint.length);
		
		
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(0);
		arraylist.add(1);
		arraylist.add(2);
		System.out.println(arraylist);
		arraylist.add(1, 10);
		System.out.println(arraylist);
		System.out.println(arraylist.size());
		
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("A", 1);
		hm.put("B",2);
		hm.put("A", 3);
		System.out.println(hm);
		System.out.println(hm.get("A"));
		System.out.println(hm.get("C"));
		hm.put(null,null);
		hm.put(null, 5);
		hm.put("E", null);
		System.out.println("hashmap :" +hm);
		
		Iterator it = hm.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	    
	    Hashtable<Integer,String> hashtb =new Hashtable<Integer,String>( );
	    hashtb.put(1, "a");
	    hashtb.put(2,"b");
	    System.out.println("hashtable "+hashtb);
	    hashtb.put(2,"bc");
	    hashtb.put(3,"bca");
//	    hashtb.put(null,"d");
//	    hashtb.put(4, null);
	    System.out.println("chnaged hashtable "+hashtb);
	    
	    HashSet<String> names = new HashSet <String>( ) ;
	    names.add("a");
	    names.add("b");
	    System.out.println (names);
	    names.add("c");
	    System.out.println(names);
	}
}