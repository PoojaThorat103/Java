package Pra;

class AnimalNew
{
	AnimalNew()	{
	System.out.println("AnimalNew Default constractor ");
	}
	
	AnimalNew(String b, String c){	
		System.out.println("AnimalNew Parameterized  constractor ");		
	}
}

class DogNew extends AnimalNew
{/*
	DogNew(){
	System.out.println(" Default DogNew constractor ");
	}*/
	
	DogNew(int i , int j){
		super();
		System.out.println(" paramitarise DogNew constractor ");
	}
}

class puppyNew extends DogNew
{
	puppyNew()
	{ super(10, 20);
		System.out.println("puppyNew constractor");
	}
}

public class TestNew 
{
	public static void main(String [] args){
		puppyNew p1 = new puppyNew();		
	}
}
