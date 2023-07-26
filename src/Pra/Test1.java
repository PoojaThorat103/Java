package Pra;

class AnimalOne
{
	AnimalOne(int k, int o)
	{
		System.out.println("AnimalOne constractor ");

	}
}


class catone extends AnimalOne
{
	catone(int a , int b)
	{
		super(20,30);
		System.out.println("catone constractor ");
	}
}




class miniCat extends catone
{
	miniCat()
	{
		super(30 ,10);
		System.out.println("miniCat constractor ");
	}
}



public class Test1 
{
	public static void main (String []args)
	{
		miniCat m1 = new miniCat();
	}
	
}





