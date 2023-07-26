package ThisKeyword;

class Animal{
	
	
	Animal(String name){
		System.out.println(name);
	}
	
Animal(String naem, int age){
		
	}

Animal(int price,int amount){
	this("pooja");
	
}
}



public class PoojaPraOfThis {

	public static void main(String[]args) {
		Animal a = new Animal(10, 20);
	}
	
}
