package StaticKeyword;

public class StaticVariables 

{
	/*If you declare any variable as static, it is known as a static variable.
	The static variable gets memory only once in the class area at the time of class loading.
	Advantages of static variable
	It makes your program memory efficient (i.e., it saves memory).
	
	The static method can not use non static data member or call non-static method directly.
   	this and super cannot be used in static context.
	*/
	
	static String Add = "This ia addition";
	String sub = "This is subtraction";
	
	
	 public static void main (String [] args)
		{
			int a = 10;
			int b = 20;
			int c = a+b;
			int d = a-c;
			
			System.out.println(Add+c);// if not use static word for variable , than it will show error.
			StaticVariables s1 =  new StaticVariables();// create object of class , to use instance variable.
			System.out.println(s1.sub + d);// non static variable.
			
		}
	

	 
}
