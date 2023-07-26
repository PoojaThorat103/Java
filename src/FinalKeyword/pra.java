package FinalKeyword;

final class Animal{
	
	final String color = "black";
	
	final void display() {
		System.out.println("This is final method");		

	}
}



class Dog extends Animal{
	
	
}













public class pra {

	public static void main (String [] args) {
		Animal animal = new Animal();
		animal.display();

		
	}
}
