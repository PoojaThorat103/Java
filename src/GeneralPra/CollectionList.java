package GeneralPra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionList {

	public static void main(String [] args) {
		ArrayList<String> name = new ArrayList<String>();
		System.out.println("-------ArrayList---");
		name.add("pooja");
		name.add("pooja");
		name.add("Deepika");
		name.add("pooja");
		
		//using iterator
		Iterator itr = name.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());	
			
		}
		
		LinkedList<String> Fname = new LinkedList<String>();
		System.out.println("-------LinkedList---");

		Fname.add("pooja");
		Fname.add("pooja");
		Fname.add(null);
		Fname.add(null);
		
		Iterator itr1 =Fname.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		Vector <String> v =new Vector <String>();
		System.out.println("-------Vector---");

		v.add("pooja");
		v.add("pooja");
		v.add("NAMA");
		v.add(null);
		v.add(null);
		
		Iterator v1 = v.iterator();
		while(v1.hasNext()) {
			System.out.println(v1.next());
		}
		
	}
	
}
