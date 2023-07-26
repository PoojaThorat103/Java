package AllPractice;

import java.io.IOException;

class Animal13{
	
	
	void display()	{
		
	System.out.println("No exception ");	
		}
	
	
	void print ()throws ArithmeticException{
		
		System.out.println("Arithmetic Exception");
	}
	
	
}


class Dog13 extends Animal13{
	
	


/*// Note : If the superclass method does not declare an exception
If the superclass method does not declare an exception, 
subclass overridden method cannot declare the checked exception but it can declare unchecked exception.*/

	
	// overriden
	void display() throws NullPointerException{		
		System.out.println("No exception : Dog ");			
	}
	

	
/*	Note : If the superclass method declares an exception
	If the superclass method declares an exception, subclass overridden method can declare 
	same, subclass exception or no exception but cannot declare parent exception.*/
	
	
	
//------------------ subclass exception ----------------------
	
	/*void print () throws NullPointerException{
		System.out.println(" subclass exception ");
	}*/
	
	
	
	
//------------------ same exception ------------------
	
	/*void print () throws ArithmeticException{
		System.out.println(" Same Exception  ");
	}
	*/
	
	
//----------------------- no exception -----------------
	
	/*void print() {
		System.out.println("No exception");
	}*/
	
	
	
// ------------------------- cannot declare parent exception ------------------------
	
	/*void print() throws Exception{
		System.out.println(" Parent Exception ");
	}*/
	
	
	
	
	
}























public class ExceptionWithMethodOverriding {

	public static void main (String [] args) {
		
	}
}
