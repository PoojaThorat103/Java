package String;

public class StringComparison 
{	
	public static void main(String []args)
	{	
		
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
			// ------------------------------------------------------------------------
	        StringBuilder s1 = new StringBuilder("Hello");    //String 1  
	        StringBuilder s2 = new StringBuilder(" World");    //String 2  
	        StringBuilder s = s1.append(s2);   //String 3 to store the result 
	        System.out.println(s.toString());  //Displays result  
	        
	        StringBuffer p1 = new StringBuffer("pooja is married with sahil");
	        StringBuffer p4=   p1.reverse();
	        System.out.println(p4);*/
	        
	        /*
	        StringBuffer sb=new StringBuffer("Hello ");  
	        sb.insert(3,"Java");//now original string is changed  
	        System.out.println(sb);*/
	        
	        StringBuffer sbw=new StringBuffer("Hellopo ");  
	        sbw.replace(2, 3, "sahil");
	        System.out.println(sbw);
	        
	        
			}
	
	
	
	
	
}
