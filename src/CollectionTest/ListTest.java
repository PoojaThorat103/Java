package CollectionTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;


public class ListTest {
	public static void main(String [] args)
	{/*
		//******************** Array List ***************** 
		ArrayList<String> name = new ArrayList <String>();
		name.add("pooja");
		name.add("sahil");
		name.add("namasvi");
		name.remove(2);
		
		System.out.println(name.contains("pooja"));// return True 
		//name.clear();// clear data
		//System.out.println(name.isEmpty());// return True -  as we clear all data 
		
		
		//**** using Iterator ****
		Iterator itr = name.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		
		//**** using ForLoop ****
		for(int i =0; i<=name.size()-1; i++)
		{
			System.out.println(name.get(i));	
		}
		
		//**** using For Each Loop ****
		for(String s : name) {
			System.out.println(s);
		}*/
		
		
		
		
		
		
		//****************************** LinkedList *******************************
		
		LinkedList <String> City =  new LinkedList <String>();
		City.add("Pune");
		City.add("Delhi");
		// we can use Iteretor , Forloop ,For each loop.
		//**** using For Each Loop ****
		for(String c : City) {
			System.out.println(c);
		}
		
		
		
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
						
	}
	
	
	
	
	
	

}
