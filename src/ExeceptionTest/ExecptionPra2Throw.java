package ExeceptionTest;

public class ExecptionPra2Throw {
	
	// ---------------------  throw --------------------
		/*We can throw either checked or uncheked exception in java by throw keyword. 
		The throw keyword is mainly used to throw custom exception.*/
	
	static void checkAge(int age) throws AgeVlidation{
		if (age<18) {
			throw new AgeVlidation("your age is not valid for voting");// need to create class of AgeVlidation - because it is costom exception
		}
		else {
			throw new AgeVlidation (" valid for voting");		
		}
	}
	
	static void checkIncome(int income) throws TaxPayable
	{
		if (income>300000)
		{
			throw new TaxPayable ("Yor are able to pay tax");
		}
		else {
			throw new TaxPayable ("Yor are not able to pay tax");
		}
	}
	
	public static void main(String[] args) {
		try {
		checkAge(15);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		try {
		checkIncome(6000000);
		}
		catch(Exception j) {
			System.out.println(j);
		}
		
		System.out.println("Rest of code");
	}
}
