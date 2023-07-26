package GeneralPra;

public class ThrowKeywordTest {
	
	void checkAge(int age)throws ArithmeticException{
		
		if(age<18) {
			throw new  ArithmeticException("age is not eligible");
		}
		else {
			System.out.println("age eligable");
		}
	}
	
	public static void main (String [] args) {
		ThrowKeywordTest T1 = new ThrowKeywordTest();
		T1.checkAge(12);
	 }
	
	
	
	
	
	
	
	
	
	
	
 
}
