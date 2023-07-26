package Pra;


class Animal{
	int age = 20;
	
	Animal(){
		System.out.println("Defaault  Contructor");
	}
	
	Animal(int i){
		System.out.println("Parametarise Contructor");
	}
	
	public void test() {
		System.out.println("Parent test method");
	}
}



class Dog extends Animal
{
	int age = 30;
	Dog(){
	 super(10);
	}
	
	public void test() {
		System.out.println("Child test method");
	}
	
	public void info(){
		test();
		super.test();
	System.out.println(super.age);
	System.out.println(age);
	
	}
}

public class SuperTest {
	
	public static void main(String [] args)
	{
		
		Dog d1 = new Dog();
		d1.info();
	}
	
}