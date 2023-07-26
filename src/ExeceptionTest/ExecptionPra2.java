package ExeceptionTest;

import java.util.jar.Attributes.Name;

/*Multi-catch block
At a time only one exception occurs and at a time only one catch block is executed.
All catch blocks must be ordered from most specific to most general, 
i.e. catch for ArithmeticException must come before catch for Exception.
*/
public class ExecptionPra2 {
	public static void main(String[] args) {
		try {
			int i = 100 / 0;
			String name = null;
			System.out.println(name.length()); //
		}
		catch ( ArithmeticException p) {
			System.out.println("Arithmetic Exception occurs " + p);
		}
		
		 catch(ArrayIndexOutOfBoundsException a)  
        {  
         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }    
		
		catch (Exception  e) {
			System.out.println("Parent Exception occurs" + e);
		}

//------------------ Java Nested try block --------------------
	
	
	/*try{
		try {
			System.out.println(" this is division");
			int a = 50/10;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		try {
			String city = null;
			System.out.println(city.length());
		}
		catch(ArrayIndexOutOfBoundsException o){
			System.out.println(o);
		}		
	}
		catch(Exception t)
		{
			System.out.println(t);
		}
		System.out.println("normal flow..");  */
	}	

}
	
	
	
	
	

