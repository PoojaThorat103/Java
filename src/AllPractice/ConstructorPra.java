package AllPractice;



class School1{
	
	int age;
	String name;
		
	// Default 
	School1(){
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	
	//Parameterized
	School1(int a, String n){
		age= a;
		name=n;		
	}
	
	void display() {
		System.out.println(+age+ " " + name);
	}
	
}



public class ConstructorPra {
	public static void main (String [] args) {
		
		School1 School1 = new School1(20, "AAA");
		School1 School2 = new School1(30, "BBB");
		
		School1.display();
		School2.display();
	
	}
}
