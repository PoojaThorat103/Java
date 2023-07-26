package AllPractice;

class Animal{
	
	String name= "cow";
	
	void displayName() {
		System.out.println("This is animal");
	}
}



class Cat extends Animal{
	
	void catDisplay() {
		System.out.println("This is Cat");
		
	}
}



public class InheritancePra {
	
	public static void main(String [] args) {
		
		Cat cat = new Cat();
		cat.displayName();
		cat.catDisplay();
		System.out.println(cat.name);
	}

}
