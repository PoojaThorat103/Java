package GeneralPra;


 class Bike{
	final int age = 30;
	
	final void run() {
		System.out.println("Run Final method");
	}
	
}


class Honda extends Bike {
	// Give compile time error
	/*void run() {
		System.out.println("Run Final method");
	}*/
	void run1(){
		run();
	}
}





public class FinalKeywordTest {
	public static void main(String [] args) {
		Bike Bike1 = new Bike();
		Bike1.run();
	}
}
