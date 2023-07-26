package AllPractice;



	
	
	class Animal1{
		
		void displayName() {
			System.out.println("Animal");	}
		
		 int age() {
			return 10;}
		
	}
	
	
	
	class Cat1 extends Animal1{
		
		void displayName() {
			System.out.println("Cat");}
		
		 int age() {
			return 8;}
		
		
	}
	
	
class Dog1 extends Animal1{
	

	void displayName() {
		System.out.println("Dog");}
	
	 int age() {
		return 12;}
	
}
	
	
	
	
	public class PolymorphismOverriding {
	
	public static void main(String[] args) {
		
		Cat1 cat = new Cat1();
		cat.displayName();		
		System.out.println(cat.age());

		
		Dog1 dog = new Dog1();
		dog.displayName();
		System.out.println(dog.age());
		
	}

}

	/*
	Usage of Java Method Overriding
	Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
	Method overriding is used for runtime polymorphism
	
	
	
	Note : Can we override static method?
			No, a static method cannot be overridden. It can be proved by runtime polymorphism, so we will learn it later.

			Why can we not override static method?
			It is because the static method is bound with class whereas instance method is bound with an object. Static belongs to the class area, 
			and an instance belongs to the heap area.*/