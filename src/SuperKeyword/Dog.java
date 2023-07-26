package SuperKeyword;

public class Dog extends Animal
{
	String color = "Black";
	Animal animal = new Animal();
	
	void printColor()
	{
		System.out.println(color); // print color of dog class
		System.out.println(super.color); // print color of Animal class
	}
	
	/*The super keyword can also be used to invoke parent class method. It should be used if subclass contains 
	the same method as parent class. In other words, it is used if method is overridden.
	*/
	void work()
	{
		super.eat();// calling method from parent class
		
	}
	
	void eat()
	{
		System.out.println("Dog eating ");
	}
	
	// 1. we user super keyword here, because in (parent & child )class present same variable name(color)
	// 2. otherwise we will use System.out.println(color); and it will print parent class value(white)

	
	/*
	
	Usage of Java super Keyword
	super can be used to refer immediate parent class instance variable.
	super can be used to invoke immediate parent class method.
	super() can be used to invoke immediate parent class constructor.
*/
}
