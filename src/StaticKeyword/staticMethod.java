package StaticKeyword;

public class staticMethod 
{
	
	// Static method
	static void myStaticMethod()
	{
		System.out.println("Static methods can be called without creating objects");
	}
	
	 // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }

	/*public static void main(String[ ] args) 
	{
	myStaticMethod();// Static method
	
	staticMethod staticMethod =  new staticMethod(); //create object to call public method
	staticMethod.myPublicMethod(); // Public method

	}*/
}
