package AllPractice;


/*Note : Rule: Call to this() must be the first statement in constructor.


Usage of Java this keyword
Here is given the 6 usage of java this keyword.

this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
this can be passed as argument in the constructor call.
this can be used to return the current class instance from the method.*/




class Animal4{
	
	
	String name;
	int age;
	
	Animal4(String name, int age){
		this.name = name;
		this.age = age;
	
	}
	
	
	
	Animal4(){
		this("cat",2);
		System.out.println("Default constructor");
	
	}
	


	void display()
	{
		System.out.println(name + " " + age);
	}
	
	
	void print() {
		System.out.println("This is print method");
		this.display(); // this can be used to invoke current class method (implicitly).  If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.
	}
}






public class ThisKeyword {
	
	public static void main (String [] args) {
		
		Animal4 animal4 = new Animal4();
		animal4.display();
		
		Animal4 Animal4 = new Animal4("tiger", 4);
		Animal4.display();
		Animal4.print();
		
	}

}
