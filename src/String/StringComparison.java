package String;

public class StringComparison 
{	
	public static void main(String []args)
	{	
		
	/*ALL ABOUT STRING :
	String is the sequence of characters
	String is non- Primitive data type - means size is not fixed
	String is a class
	String is an immutable object		
	To create strings there are 3 classes : String, String buffer, String builder
		
	String class syntax : 
			
			public final class String extends Object implements CharSequence, Serialiable, Comparable () {
			
		}*/
		
		
		
	/*There are two ways to create String object:

		By string literal
		By new keyword */
	// By equals() method -- It compares values of string for equality. 
	// By = = operator -- It compares references not values.
	
	

			/*String s1 = "pooja"; // value will present in 'String constant pool' because we are creating String object by "String literal "
			String s2 =  "pooja";
			String s3 = new String("pooja"); // jvm will  create object in Heap memory and value will present in 'String constant pool'
			String s4 = "sahil";
			
			System.out.println(s1.equals(s2)); // equals -  it will compare value which is "pooja" so it will return True
			System.out.println(s1.equals(s3)); // equals -  it will compare value which is "pooja" so it will return True
			
			System.out.println(s1.equals(s2)); // == -  it will compare references which is same for "pooja" so it will return True
			System.out.println(s1.equals(s3)); // == -  it will compare references which is Different so it will return False 

			*/
		
		//compare by compareTo() method
		//Suppose s1 and s2 are two string variables. If:
		//s1 == s2 :0
		//s1 > s2   :positive value
		//s1 < s2   :negative value			
		//The String compareTo() method compares values lexicographically
		//and returns an integer value that describes if first string is less than, equal to or greater than second string
		
			/*
			String name1 = "pooja";
			String name2 =  "pooja";
			String name3 = "Sahil";		
			System.out.println("it will show 0 as both are equal  "+name1.compareTo(name2));
			System.out.println(name1.compareTo(name3));
			
			*/				
		
		// *********************************** String Concatenation in Java *******************
		
		//In java, string concatenation forms a new string that is the combination of multiple strings. 
		//There are two ways to concat string in java:
		//By + (string concatenation) operator
		//By concat() method*/
			
				/*
				String name6 = "pooja" + "Sahil" ;
				System.out.println(name6);
				
				String n1 = "poonam" ;
				String n2 = "amruta" ;
				String n3 = n1.concat(n2);
				System.out.println(n3);*/
						
	// *********************************** Substring in Java ******************* Pending 
						
			
	// *********************************** Java String toUpperCase() and toLowerCase() method *******************
		/*	
			String Address = "PuNe";
			System.out.println(Address.toUpperCase());// output : PUNE
			System.out.println(Address.toLowerCase()); // output : pune
			*/
	// *********************************** Java String trim() method *******************
	//The string trim() method eliminates white spaces before and after string.
			/*
			String city = " Pune ";
			System.out.println(city); // pune
			System.out.println(city.trim()); //pune
			*/
			
	// *********************************** 	Java String charAt() method *******************
	//The string charAt() method returns a character at specified index
			String name = "pooja";
			System.out.println(name.charAt(0));//p
			System.out.println(name.charAt(4));//a
		//	System.out.println(name.charAt(5));// will throw StringIndexOutOfBoundsException exeception 

		/*	String n1 = "poo";
			String n2 = " thorat ";
			System.out.println(n2.trim());
			String n3 = n1.concat(n2);
			String n1 =  "sdsf" + "sfsd";
			// ------------------------------------------------------------------------
	  
	        */
	        
	    	// *********************************** 	Java String isEmpty() *******************       
	        
	        String city = "";
	        System.out.println(city.isEmpty());
	        
	        //Note : Note that here empty means the number of characters contained in a string is zero.
	        
	
	       //  *********************************** 	Java String equalsIgnoreCase()n *******************   
	        
	     //   Note : doesn't check the case sensitivity
	        /*String Country = "InDIa";
	        String Country1 = "india";
	        String Country2 = "AAAA";
 
	        System.out.println(Country.equalsIgnoreCase(Country1)); //true because content and case both are same  
	        System.out.println(Country1.equalsIgnoreCase(Country2)); //false because content is not same  
	        */
	        
	        String name1 = "Pooja" ;
	        String name2 = "sfsd";
	        
	        String name3 = "Pooja";
	        
	        String name4 = new String ("Pooja");
	        
	        
	        System.out.println("-----" + name1.equals(name3));
	        System.out.println(name1 == name3);
	        
	        System.out.println("-----" + name1.equals(name4)); // equals compare value 
	        System.out.println(name1 == name4);//  ==  compare referance 
	        

			}
	
	/*
	Note :  equals compare value of the string
			==  compare referance 
	*/
	
	
	
}
