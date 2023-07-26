package ThisKeyword;

public class AthisMethod 
{

	void thisMethodA()
	{
		System.out.println(" this is method A");
	}
	
	void thisMethodB()
	{
		System.out.println(" this is method B");
		//thisMethodA();//same as this.thisMethodA()  
		this.thisMethodA();
	}
}
