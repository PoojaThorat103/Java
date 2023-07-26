package Pra;

public class ThrowPra {
	
	static void checkAge(int age) {
		if (age<18) 
		throw new ArithmeticException ("Invalid age");
		else
			System.out.println(" Valid age");}

	static void test(){
		System.out.println(" hi");
		checkAge(24);
		System.out.println("Hello ");
	}
	
	static void Login() throws Pra.Login {
		System.out.println("this is login");
		throw new Login ("login Successful");
	}
	
	
	public static void main (String [] args) {
		checkAge(20);
		System.out.println(" rest code ");
		test();
		try {
			Login();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
