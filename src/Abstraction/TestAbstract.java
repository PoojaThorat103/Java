package Abstraction;
/*
An abstract class can have a data member, abstract method, 
method body (non-abstract method), constructor, and even main() method.*/
abstract class Bike
{
	abstract void run();//no method body and abstract  	
	{
		
	}
}
class Honda extends Bike
{
	void run() 
	{
		System.out.println("This is Honda Bike");
	}
}
public class TestAbstract 
{
	public static void main(String []args)
	{
		Bike B1 = new Honda();
		B1.run();
	}
}

//In this example, Bike is an abstract class that contains only one abstract method run. 
//Its implementation is provided by the Honda class.