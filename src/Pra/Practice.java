package Pra;

class animal{
	
	 static int addition(int a, int b) {
		 System.out.println("This is Animal ");
		return a+b;
	}
	
	 static int addition(int a, int b, int c ) {
		 System.out.println("aaddition 2 ");
		return a+b;
	}
}

class Cat extends animal {
	
	void walk() {
		System.out.println("cat walk ");
	}
	
	static int addition(int a, int b) {
		 System.out.println("This is CAT  ");
		return a+b;
	}
}


class A{
	A(){
		System.out.println("This is A");
	}
}

class B extends A{
	B(){
		super();
		System.out.println(" This is B");
	}
	
}


abstract class AB{
	abstract void run();
}

interface CD{
	void info();
}


interface EF{
	void print();
}
class age implements CD,EF {
	void ageInfo() {
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}
	
}



public class Practice {

	public static void main (String []args) {	
		animal.addition(1, 2, 4);
		
		Cat c = new Cat();
		c.addition(2, 4);
	}
}
