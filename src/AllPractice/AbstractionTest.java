package AllPractice;


abstract class Animal5{
	
	void info() {
		System.out.println("This is non-abstract method");}
	
	abstract void display();
	
}



class Dog extends Animal5{

	@Override
	void display() {
		System.out.println("This is DOG");	}
	
}



public class AbstractionTest {

	public static void main(String[] args) {
		Animal5 Animal5 = new Dog();
		Animal5.display();
		

	}

}

/*
Rule: If there is an abstract method in a class, that class must be abstract.

Rule: If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract.



Points to Remember
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.*/

