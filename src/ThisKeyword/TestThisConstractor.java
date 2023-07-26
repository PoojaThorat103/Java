package ThisKeyword;

public class TestThisConstractor 
{
	public static void main (String [] args)
	{
		ThisConstractor t1 = new ThisConstractor("India", "Maharastra");
		ThisConstractor t2 = new ThisConstractor("India", "Maharastra", "pune");
		
		t1.display();
		t2.display();
	}
	
}
