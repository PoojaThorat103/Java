package SuperKeyword;

class Mobile{
	
	Mobile(){
		System.out.println("This is mobile constructor");
	}
}


class Iphone extends Mobile{
	
	Iphone(){
		super();/*// no need to write as (As we know well that default constructor is provided by compiler automatically if there is no constructor.
		But, it also adds super() as the first statement
		Note: super() is added in each class constructor automatically by compiler if there is no super() or this().
		)*/
		System.out.println("This is Iphone constructor");
	
	}
}



public class SuperConstructor {
	
	public static void main(String [] args) {
		Iphone iphone = new Iphone();
	}

}
