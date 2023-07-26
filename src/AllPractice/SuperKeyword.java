package AllPractice;

class Animal3{
	
	String color = "Black";
	
	void displayName() {
		System.out.println("Animal name");}
	
}

class Dag3 extends Animal3{
	
	String color = "grey";
	
	void printColor() {
		System.out.println("this is dog color : " + color);
		System.out.println("this is Animal color : " + super.color);}
	
	void displayName() {
		System.out.println("Dag3 name");}
	
	void printName() {
		displayName() ;
		super.displayName();
	}
}




public class SuperKeyword {
	
	public static void main(String [] args) {
		
		Dag3 dag3 = new Dag3();
		dag3.printColor();
		dag3.printName();
		
	}

}


/*Note :
	
	Usage of Java super Keyword
	super can be used to refer immediate parent class instance variable. (if subclass and paraent class has same fiels)
	super can be used to invoke immediate parent class method. (method overriding)(if subclass and paraent class has same method)
	super() can be used to invoke immediate parent class constructor.*/