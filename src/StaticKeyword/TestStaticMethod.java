package StaticKeyword;

public class TestStaticMethod extends staticMethod
{
	public static void main(String[ ] args) 
	{
		staticMethod staticMethod =  new staticMethod();
		myStaticMethod(); //call static method  , directly by method name
		staticMethod.myStaticMethod(); // call static method by object 
		staticMethod.myPublicMethod(); // call public method
	}
}



/*que = 
1. static variable and method can call in same class - directly
2. Non static variable and method can call in same class -  by creating object 
3. if want to use static - Non static things in TestClass -  by creating object  - use , why use static
4. static things can not use in non static method directly , need to create object and use it .
*/