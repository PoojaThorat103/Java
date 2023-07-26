package SuperKeyword;

class Tree{
	
	String color = "green";
	
	void info() {
		System.out.println("this is tree info");
	}
	
	
	// constructor 
	
	Tree(){
		System.out.println("This is Tree constructor");
	}
	
}


class fruit extends Tree{
	
	String color = "red";
	
	void display(){
		System.out.println(color);
		System.out.println(super.color);
		super.info();
	}
	
	void info() {
		System.out.println("this is fruit info");
		super.info();
	}
	
	// constructor
	
	fruit(){
		System.out.println("This is fruit constructor");
	}
	
	
	
	
	
}




public class Pra {
	
	public static void main(String [] args) {
	fruit f = new fruit();
	f.display();
	
	
	}
	
}
