package GeneralPra;




class Bike1{
	int age;
	int salary;
	Bike1(){
		System.out.println("This is Bike1 constractor ");
	}

	Bike1(int a, int b){
	 age = a;
	 salary = b;
		System.out.println("This is parametarised constractor ");
	}
	
	void display() {
		System.out.println(age+""+salary);
	}
	
	Bike1(int a, int b, int c){
		a= a;
		b=b;
		c=c;
	}
}

public class ConstractorTest {
	
	public static void main (String [] args) {
		Bike1 B1 = new Bike1();
		Bike1 B2 = new Bike1(20,7000);
	
	}

}
