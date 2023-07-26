package Inheritance;

public class Wholeseller
{
	int availableQtyChair = 50;
	String status = "";
	int Receipt ;
	
	public void CheckOrderAvailability(int  availableQtyChair , int order)
	{
		if(availableQtyChair > order)
		{
			System.out.println("Available" );
			Receipt = order*1000;
			System.out.println(Receipt);	
			
		}
		else
		{
			System.out.println("Out of stock");
		}
		
		
	}
}



