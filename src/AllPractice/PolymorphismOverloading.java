package AllPractice;

/*
Advantage of method overloading
Method overloading increases the readability of the program.

Different ways to overload the method
There are two ways to overload the method in java

By changing number of arguments
By changing the data type
*/



class Additions{
	
	// By changing number of arguments
	static int add(int a, int b) {
		
		return a+b;		
	}
	

	
	
	static int add(int a, int b, int c) {
		
		return a+b+c;
	}
	
	// By changing the data type
	static double add(double a, double b) {
		return a+b;
				
	}
	
	public double add(double a, double b, double c) {
		
		return a+b+c;
	}	
	
}



public class PolymorphismOverloading {

	public static void main(String [] args) {
		
		// calling static method by class name
		System.out.println(Additions.add(10, 20));
		System.out.println(Additions.add(10, 20, 30));
		
		// calling non static method by creating object 
		Additions additions = new Additions();
		System.out.println(additions.add(11.11, 22.22));
	}
}
