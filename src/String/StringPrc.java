package String;

public class StringPrc 
{
	public static void main (String [] args)
	{// But in Java, string is an object that represents a sequence of characters.
		
		String name1 = "POOJA"; //creating string by java string literal  
		String name2 = new String("PooJA"); // creating java string by new keyword
		char ch[] = {'N','A','Y','A','N'} ;
		String name3 = new String(ch);////converting char array to string  
				
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
				
		// Java String compare
		
		System.out.println("is it equals =  " + name1.equals(name2)); // VALUE MUST BE SAME 
		System.out.println(name1.equalsIgnoreCase(name2));// THIS IS equalsIgnoreCase 
	}
}
