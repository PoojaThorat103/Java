package Inheritance;

public class TestMultilevel_Inheritance {
	
	public static void main (String [] args)
	{
		
		MultiLevel_Animal A1 = new MultiLevel_Animal();
		A1.animalEat();
		// A1.catEat();  //show error 
		// A1.MinicatEat();  //show error 
		
		
		Multilevel_cat c1 = new Multilevel_cat();
		c1.catEat();
		c1.animalEat();
		//c1.MinicatEat(); //show error 
		
		
		
		Multilevel_MiniCat m1 =  new Multilevel_MiniCat();
		m1.MinicatEat();
		m1.catEat();
		m1.animalEat();
		
	
	 
	}

}
