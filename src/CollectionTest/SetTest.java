package CollectionTest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;


public class SetTest {
	public static void main(String []args)
	{		
		/*// in set - values are unique so , if user enter multiple null - though it will give one null in output , so in set 
		// at leaset 1 null value is allow.
		System.out.println("********* HashSet ************");
		HashSet <String> name =  new HashSet <String>();
		name.add("Pooja");
		name.add("sahil");
		name.add("nama");
		name.add("sahil");
		name.add(null);
		name.add(null);
		for(String n : name) {
			System.out.println(n);
		}
			// in HashSet - can not use get method -  because it is unordered// allow 1 null value only 
		
		
		//**************** LinkedHashSet ********************8
		// ordered and unique
			System.out.println("********* LinkedHashSet ************");
			LinkedHashSet <String> name1 = new LinkedHashSet (); 
			name1.add("pooja");
			name1.add("sahil");
			name1.add("nama");
			name1.add("sahil");
			name1.add(null);
			name1.add(null);
			for(String n1 : name1) {
				System.out.println(n1);
			}
				
				
				//**************** SortedSet ********************8
				// Sorted order always and unique ()
				// null not allow -  show null pointer exception
				System.out.println("********* TreeSet ************");
				TreeSet<String> name2 =   new TreeSet<String>();
				name2.add("pooja");
				name2.add("sahil");
				name2.add("nama");
				name2.add("sahil");
				//name2.add(null); // Throw null pointer execption
			
				for(String n2 : name2) {
					System.out.println(n2);
				}
				*/
				
				// *************************** QUEUE *********************
				//**************** Priority Queue ********************8
				System.out.println("********* PriorityQueue ************");
				// return  not in order not in FIFO order 
				//  add and remove fron one side only
				//doesn't allow null values - show null pointer execption.
				
				PriorityQueue<String> name3 =  new PriorityQueue<String>();
				name3.add("pooja");
				name3.add("sahil");
				name3.add("nama");
				name3.add("sahil");
				//name3.add(null);
				
				/*System.out.println( "this is element  " + name3.element());
				//name3.element();
				name3.poll();*/
				
				Iterator itr = name3.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				
				/*for(String n3 : name3) {
					System.out.println(n3);
				}*/
				
				
				//**************** ArrayDeQueue ********************8
				System.out.println("********* ArrayDeQueue ************");
				// return in FIFO order 
				//  add and remove from Both side 
				//doesn't allow null values - show null pointer execption.
				ArrayDeque<String> name4 = new ArrayDeque<String> ();
				name4.add("pooja");
				name4.add("sahil");
				name4.add("nama");
				name4.add("sahil");
				//name4.add(null);
				// we can also use poll method as well 				
				// can preform operation from both side.			
			System.out.println( "this is peek first - " + name4.peekFirst());	
			System.out.println("this is peek Last -  " +name4.peekLast());
			name4.addLast("llllllll");
			
				for(String n4 : name4) {
					System.out.println(n4);
				}
					
				

	//********************************************-------- MAP  ---------***********************************************************************
				/*System.out.println("********* HashMap ************");
				//  map allow to store data in key value pair
				
				HashMap<String, String> name5 = new HashMap<String , String> ();
				name5.put("one", "pooja");
				name5.put("two", "sahil");
				name5.put("three", "nama");
				name5.put("four", "sahil");
				name5.put("one", "pooja 1");
				name5.put(null,"1");
				name5.put(null, "2");//latest value will display
				
				//System.out.println(name5.get("two"));// to get perticular value
				//System.out.println(name5.containsKey("two"));// check weather key present or not .
				
				// try this method also - remove , size, is empty , clear , containKey ,  contain value.
				for(Map.Entry<String, String> h : name5.entrySet()) {
					System.out.println(h.getKey()  +  h.getValue());
				}
				
				
				
				System.out.println("********* LinkedHashMap ************");
				//  map allow to store data in key ordered
				 
				
				LinkedHashMap<String, String> name6 = new LinkedHashMap<String , String> ();
				name6.put("one", "pooja");
				name6.put("two", "sahil");
				name6.put("three", "nama");
				name6.put("sfour", "sahil");
				name6.put("one", "pooja 1");
				name6.put(null,"1");
				name6.put(null, "2");//latest value will display
				
				for(Map.Entry<String, String> n6 :name6.entrySet()) {
					System.out.println(n6.getKey() + n6.getValue());
				}
		
				
				
				System.out.println("********* TreeMap ************");
				//   Sorted order always
				// null not allow -  show null pointer exception
				
				TreeMap<String , String> name7 = new TreeMap<String , String> ();
				name7.put("one 1", "pooja");
				name7.put("two 2", "sahil");
				name7.put("three 3", "nama");
				name7.put("four 4", "sahil");
				//name7.put(null, "null value"); Throw exeception
				for(Map.Entry<String, String> n7 : name7.entrySet()) {
					System.out.println(n7.getKey() + n7.getValue());
				}
				
				
				// ********** Sort Collection ***********
				System.out.println("********* Sort Collection ************");
				ArrayList<String> city = new ArrayList<String> ();
				city.add("pune");
				city.add("Mumbai");
				city.add("thane");
				
				Collections.sort(city , Collections.reverseOrder());
				
				for(String c1 : city) {
					System.out.println(c1);
				}
				
				System.out.println();*/
	} 
	// comparable , comparator
					
					 
}	
		
		
	



