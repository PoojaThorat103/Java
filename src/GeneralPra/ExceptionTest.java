package GeneralPra;

	class TestOne{
		
		void checkData() {
		try {
			//int value = 100/5;
			String name = null;
			System.out.println(name.length());
		}
	
		
		catch(ArithmeticException e){
			System.out.println(e);			
		}	
		
		/*catch(Exception o) {
			System.out.println(o);	
		}*/
		finally {
			System.out.println("finally always execute");
		}
		System.out.println("rest of the code");  
		}
	}
	
	public class ExceptionTest {
	public static void main(String [] args) {
		
		TestOne T1 = new TestOne();
		T1.checkData();
		
	}
	
}
