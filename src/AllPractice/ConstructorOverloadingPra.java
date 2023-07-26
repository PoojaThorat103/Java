package AllPractice;

// Constructor  Oveloading

class School3{
	
	int age;
	String name;
	String address;
	int count;
		
	
	//Parameterized
	School3(int a, String n){
		age= a;
		name=n;		
	}
	
	School3(int c, String ad, int age ){
		
		count =c;
		address = ad;
		this.age= age;
	}
	
	
	
	
	void display() {
		System.out.println(+age+ " " + name + " "+ address + "" + count);
	}
	
}




public class ConstructorOverloadingPra {
	
	public static void main (String [] args) {
		
		School3 School3 = new School3(20,"AAA");		
		School3 School4 = new School3(23,"BBB", 9);
		
		School3.display();
		School4.display();
		
	}

}
