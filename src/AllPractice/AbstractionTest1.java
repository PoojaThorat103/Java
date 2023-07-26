package AllPractice;


interface Animal6{
	
	// abstract method
	abstract void info();
	
	
	// default method
	default void msg() {
		System.out.println("This is message");
	}
	
	
	// Static method
	static void payment() {
		System.out.println("This is payment");
	}
	
	
}





class Cat6 implements Animal6{

	
	public void info() {
		System.out.println("This is Cat");
		
	}
	
	
}






public class AbstractionTest1 {
	public static void main (String [] args) {
		
		Animal6 animal6 = new Cat6();
		animal6.info();
		
		animal6.msg();
		Animal6.payment();
	}

}




/*Note :
	
	Since Java 8, we can have default and static methods in an interface.

	Since Java 9, we can have private methods in an interface.

	Why use Java interface?
	There are mainly three reasons to use interface. They are given below.

	It is used to achieve abstraction.
	By interface, we can support the functionality of multiple inheritance.*/