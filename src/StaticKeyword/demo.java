package StaticKeyword;

public class demo
{
	static int i =10;
	demo(){
		i++;
		System.out.println(i);
	}
	
	public static void main (String []args)
	{
		demo d1 = new demo();
		demo d2 = new demo();
	}
}
