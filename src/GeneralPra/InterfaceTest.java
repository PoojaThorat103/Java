package GeneralPra;

interface School{
	//abstract method
	public abstract void SName();// can write it as ---void SName or  abstract void SName
	
	//default method	
	default void SAddress() {
		System.out.println("this is default method");}	
	
	 static void salary() {
			System.out.println("In School = salary in Requirement - 40,000");}	
	 
	/*//private method -- my current version of java is not supporting it 
	 private void SPlace () {
		System.out.println("this is static method");

	}*/
}

class AsmaSchool implements School{
	@Override
	public void SName() {
		System.out.println("S Name is = Asma");
		SAddress();// as we have implement School class, so we can call method (dafault & static)as only by its name.	
	}	

}
interface SidSchool {
	public void SName();
	
	
}
	//Multiple inheritance
	class NSchool implements School, SidSchool{

		@Override
		public void SName() {
			System.out.println("----S Name is = NSchool");
			
		}

		
}








//------------------------- Main Class ---------------

public class InterfaceTest {

	public static void main (String [] args) {
		School S = new AsmaSchool();
		S.SName();
		S.SAddress();
		S= new NSchool();
		S.SName();
		
	}

}