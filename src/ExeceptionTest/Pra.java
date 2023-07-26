package ExeceptionTest;

import java.io.IOException;

class Mobile{
	
	void Iphone() throws IOException{
		System.out.println("Iphone");}
	
	
	void Samsung() throws IOException{
		System.out.println("Samsung");
		
		//1st option : Handle the exception
		
		/*try {
		Iphone();
		}
		
		catch(IOException i) {
			System.out.println(i);
		}*/
		
		
		//2nd option :  declare the exception by Throws keyword
		
		Iphone() ;
	}
	
	
	
}





public class Pra {
	public static void main(String [] args) {
		
		try {
			int value = 10/2;
			
			String s = null;
			System.out.println(s.length());	}
		
		
		catch(ArithmeticException a) {
			System.out.println(a);}		
		
		catch(NullPointerException n) {
			System.out.println(n);}
		
		catch (Exception e) {
			System.out.println(e);}
	
		finally {
			System.out.println("Finally block");
		}
		
		// Throws Keyword : used to declare an exception 
		
		
		
		
		System.out.println("Rest of code 3");

}

}