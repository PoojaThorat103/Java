package MethodOverriding;

class Animal{
	
	void eat() {
		System.out.println("Animal eat");}
	
}


class Dog extends Animal{
	
	void eat() {
		System.out.println("Dog eat");
	}
}




public class Pra {
	
	public static void main (String [] args) {
		Dog Dog = new Dog();
		Dog.eat();
		
		// Upcasting
		
		Animal animal = new Dog();
		animal.eat();
		
		
	}
	
	

}
