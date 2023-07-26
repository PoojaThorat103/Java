package AllPractice;

//Runtime polymorphism
// Upcasting

/*Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to 
be called is based on the object being referred to by the reference variable.

Upcasting
If the reference variable of Parent class refers to the object of Child class, it is known as upcasting. For example:*/


class Animal2{
	
	void displayName() {
		System.out.println("Animal");	}
	
	 int age() {
		return 10;}
	
}



class Cat2 extends Animal2{
	
	void displayName() {
		System.out.println("Cat");}
	
	 int age() {
		return 8;}
	
	
}


class Dog2 extends Animal2{


void displayName() {
	System.out.println("Dog");}

 int age() {
	return 12;}

}

public class PolymorphismOverriding1 {

	public static void main(String[] args) {
	
		
		// Upcasting way 1 : Use this always : no need to create referance veriable multiple time.
		
		Animal2 animal2 ;		
		
		
		animal2 = new Dog2();		
		animal2.displayName();
		System.out.println("This is Dog " + animal2.age() );
		
		animal2 = new Cat2();
		animal2.displayName();
		System.out.println("This is CAT " + animal2.age() );
		
		
		// Upcasting way 2
		
		/*
		Animal2 animal2 = new Cat2();
		animal2.displayName();
		System.out.println("This is CAT " + animal2.age());
	
		
		Animal2 animal3 = new Dog2();
		animal3.displayName();
		System.out.println("This is DOG " + animal3.age());*/
		
	}

}
