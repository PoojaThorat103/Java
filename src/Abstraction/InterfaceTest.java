package Abstraction;

interface Requirement {
	public abstract void NoOfVancancy();
	// default method -- not compulsory to override, we can override it 
	default void position() {
		System.out.println("position in requirement -  dev, testing ");		
	}
	//static method --  not compulsory to override , we can call it just like normal static method.// we can not override it.
	 static void salary() {
		System.out.println("salary in Requirement - 40,000");
	}
	 /*//Private Method : 
	 In java 9 
	 Private method can not be abstract method 
	 it has static and non statis private method 
	Private static and non static method can call inside the default methods in interface
	Private static method can call inside the another static method in interface
	
	 */
}

class extra implements Requirement{

	@Override
	public void NoOfVancancy() {
		System.out.println("No of vacancy in extra - 20 ");
	
	}
	// default method 
		public void position() {
		System.out.println("position in extra - testing ");
		/*Requirement.salary();
		position();*/
		}	
		
		
	}	

public class InterfaceTest {
	public static void main (String [] args)
	{
		Requirement r = new extra();
		r.NoOfVancancy();
		r.position();
		Requirement.salary();//static method
	}

}
