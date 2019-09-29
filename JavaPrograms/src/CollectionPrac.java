import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;


public class CollectionPrac {

	public static void main(String[] args) {
	
		System.out.println("************************");
		int [] arrayint=new int[2];
		arrayint[0]=0;
		arrayint[1]=1;
	//	arrayint[2]=2;
	//	arrayint[3]=3;
		System.out.println(arrayint[0]+" "+arrayint[1]);
		System.out.println(arrayint.length);
		
		System.out.println("************************");
		List<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(0);
		arraylist.add(1);
		arraylist.add(2);
		System.out.println(arraylist);
		arraylist.add(1, 10);
		System.out.println(arraylist);
		System.out.println(arraylist.size());
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
		
		System.out.println("************************");
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay"); 
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("************************");
		HashSet<String> set=new HashSet<String>();  
		set.add("Akash");
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay"); 
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println("Set is"+itr.next());  
		} 
		
		System.out.println("************************");
		LinkedHashSet<String> linkedset=new LinkedHashSet<String>();  
		linkedset.add("Ravi");  
		linkedset.add("Vijay");  
		linkedset.add("Ravi");  
		linkedset.add("Ajay");  
		Iterator<String> linkeditr=linkedset.iterator();  
		while(linkeditr.hasNext()){  
		System.out.println("Linked set is"+linkeditr.next());  
		}  
		
		System.out.println("************************");
		TreeSet<String> treeset=new TreeSet<String>();  
		treeset.add("Ravi");  
		treeset.add("Vijay");  
		treeset.add("Ravi");  
		treeset.add("Ajay");  
		//traversing elements  
		Iterator<String> treeitr=treeset.iterator();  
		while(treeitr.hasNext()){  
		System.out.println("Tree set is"+treeitr.next());  
		}  
		
		System.out.println("************************");
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
		System.out.println(hm.values());
		for(Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
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