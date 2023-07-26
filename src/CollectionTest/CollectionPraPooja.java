package CollectionTest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeSet;

public class CollectionPraPooja {
	
	public static void main(String [] args)
	{
		/*ArrayList<String> name = new ArrayList<String>();
		name.add("pooja");
		name.add("pooja");
		name.add("Sahil");
		
		for (String s: name) {
			System.out.println(s);
		}
		
		for(int i=0;i<= name.size()-1;i++) {
			System.out.println(name.get(i));
		}*/
		
		LinkedHashSet <String> name1 = new LinkedHashSet<String> (); 
		name1.add("--pooja");
		name1.add("--sahil");
		

		for (String s: name1) {
			System.out.println(s);
		}
		
		TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		//  al.add(null);// throught runtime execption
		
		  for (String s: al) {
				System.out.println(s);
			}
			
		   ArrayDeque<String> deque = new ArrayDeque<String>();  
		   deque.add("Ravi");    
		   deque.add("Vijay"); 
		   
		   for (String o: deque) {
				System.out.println(o);
			}
		   
		   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");
		 
		   
		   for (Entry<Integer, String> j: map.entrySet()) {
				System.out.println(j);
			}
		   
	}

}
