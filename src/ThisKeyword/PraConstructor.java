package ThisKeyword;


class Company{
	
	
	Company(){
		System.out.println("Company C.");
	}
	
	
	Company(int year){
		this();
		System.out.println("Company2nd C.");
	}
	
}



public class PraConstructor {
	public static void main(String[] args) {
	
		Company Company = new Company(10);
	}
}
