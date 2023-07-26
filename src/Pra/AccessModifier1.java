package Pra;

public class AccessModifier1 

{	
	protected int value = 20;
	
	//default -  within same package 
	// public -  anywhere
	// private - within same class only
	// protected -  within same package , and extended class(another package)
	
	public static void main(String [ ] args)
	{
		AccessModifier1 A1 =  new AccessModifier1();
	System.out.println(A1.value);
	}
	
}
