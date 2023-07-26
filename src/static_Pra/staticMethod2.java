package static_Pra;

public class staticMethod2 extends staticMethod1  
{
	static void salary()
	{
		System.out.println("salary - 30000 ");
		status();
		staticMethod1 m1 = new staticMethod1();// to calling non static method
		m1.EmpId(); // calling non static method
	}
	
	
	public void dummy()
	{
		 status();//static method
		 EmpId(); // non static method
	}
}
