package static_Pra;

public class Testoverriding 
{
	public static void main (String []args)
	{
	overriding1 d1 = new overriding1();
	 d1.getDetails();
	 
	 d1 = new overriding2();
	 d1.getDetails();
	}
}
