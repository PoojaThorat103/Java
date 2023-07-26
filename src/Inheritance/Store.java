package Inheritance;

public class Store extends Wholeseller
{		
	
		public int orderChair(int order)
		{
			Store s1 = new Store();
			s1.CheckOrderAvailability(availableQtyChair, order);		
			return Receipt;
		}
	

}
