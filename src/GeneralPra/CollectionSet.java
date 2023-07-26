package GeneralPra;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class CollectionSet {
public static void main(String[]args) {
	HashSet<String> h = new HashSet<String>();
	h.add("pooja");
	h.add("NAMA");
	h.add("pooja");
	h.add(null);
	h.add(null);
	
	//using for each loop
	for(String name:h) {
		System.out.println(name);
	}
	/*//using iterator
	Iterator<String> itr = h.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());	
		
	}*/
	
	//**************** Linked Hash Set ********************
	LinkedHashSet<String> name2 = new LinkedHashSet<String>();
	System.out.println("********* Linked Hash Set ************");
	name2.add("pooja");
	name2.add("NAMA");
	name2.add("pooja");
	name2.add(null);
	name2.add(null);
	
	for(String HName :name2) {
		System.out.println(HName);
	}
	

}

}