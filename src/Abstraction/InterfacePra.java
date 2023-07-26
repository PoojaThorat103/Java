package Abstraction;

interface Animal1{
	
	abstract void eat();
}



interface Zoo{
	
	abstract void eat();
}
	



class Dog1 implements Animal1, Zoo{

	@Override
	public void eat() {
		System.out.println("This is Dog1");
	}
	
}



	

public class InterfacePra {

	public static void main (String [] args) {
		Dog1 Dog1 = new Dog1();
		Dog1.eat();
	}
}
