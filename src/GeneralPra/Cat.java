package GeneralPra;

public class Cat extends Animal {
	 String eat = "Cat Food";
	 
	void meow() {
		System.out.println("cat meow");
		System.out.println(super.eat);	
		super.run();
	}
	
	void run() {
		System.out.println("Cat running");
	}

	
	// constractor
	
	Cat(){
		//super();
		System.out.println("Cat is created");
	}
}
