package Inheritance;

 class Animal{
	
	 void eat() {
		 System.out.println("Animal eat"); }
	
}


 class Cat extends Animal{
	 
	 void walk() {
		 System.out.println("Cat walk");}
	 
 }

class Dog extends Cat{
 
	void bark() {
		 System.out.println("Dog bark");
	}
}



public class Pra {

	public static void main(String [] args) {
		
		Dog dog = new Dog();
		dog.bark();
		dog.walk();
		dog.eat();
	}
}
