package Abstraction;

abstract class NaukriPortal
{
	NaukriPortal(){System.out.println(" this is nokery portal");}  // constractor // when we create the object of clield class at taht time it will invoke parent call contractro 1st 
	abstract void NoOfVancancy();
	
	abstract void VacancyForPosition();
	
	void trial() 
	{
		System.out.println("this is trial method");
	}
}

class Wipro extends NaukriPortal
{
	 void NoOfVancancy()
	{
		System.out.println(" NoOfVancancy in Wipro  = 10 ");
	}
	 
	void VacancyForPosition()
	{
		System.out.println("  VacancyForPosition in Wipro = Tester ");
	}
	
	void NoOfEmployee()
	{
		System.out.println(" Method od wipro Class - Number of employee - 10,000");
	}
}

class Infosys extends NaukriPortal
{
	void  NoOfVancancy()
	{
		System.out.println(" NoOfVancancy in Infosys = 20 ");
	}
	
	void VacancyForPosition()
	{
		System.out.println("  VacancyForPosition in Infosysy = Develpoer ");
	}
}

public class AbstractionByClass 
{
	public static void main (String []args)
	{
		NaukriPortal N =  new Wipro();
		N.VacancyForPosition();
		//N.trial(); // Non - abstract method
		N = new Infosys();
		N.VacancyForPosition();
		
		
		/*Infosys Infosys =  new Infosys();
		Infosys.trial(); //// Non - abstract method ,by creating object of  child class
		*/

	}

}