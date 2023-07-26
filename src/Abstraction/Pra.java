package Abstraction;

abstract class Animal {
	
	abstract void eat();

}

class Dog extends Animal{

	@Override
	void eat() {
		System.out.println("This is dog");
		
	}
	
}





public class Pra {

	public static void main (String[] args) {
		Animal animal = new Dog ();
		animal.eat();
		
	}
	
}
