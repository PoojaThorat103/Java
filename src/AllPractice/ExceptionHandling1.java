package AllPractice;

import java.io.IOException;
import java.sql.SQLException;

//--------------------- Throws Keyword --------------------------------

/*NOTE: declared Checked exception only
We can declare multiple exceptions using throws keyword that can be thrown by the method. For example, main() throws IOException, SQLException.	*/


class Animal11{
	
	void print() throws IOException, SQLException { 
		System.out.println("device error");
		}
	
	
	void display() throws IOException, SQLException {
		print();
	}
	
	void information() {
		try {
		print();
		
		}
		
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
}



public class ExceptionHandling1 {

	public static void main (String [] args)  {
		Animal11 animal11 = new Animal11();
		animal11.information();

		
		
		
	}
	
}
