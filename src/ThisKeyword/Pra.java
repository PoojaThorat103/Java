package ThisKeyword;

class Mobile{
	
	String name;
	int price;
	
	Mobile(String e, int price){
		
	name = e;
	this.price = price;	
	}
	
	void display() {
		System.out.println(name+ "" + price);
		this.info();
	}
	
	void info() {
		System.out.println("INFO");
	}
	
}



public class Pra {

	public static void main(String[] args) {
		Mobile mobile = new Mobile("Pooja", 26);
		mobile.display();
		
		
	}

}
