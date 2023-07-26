package GeneralPra;

abstract class Collage{
	
	abstract void clgName();
	
	void clgAddress() {
		System.out.println("Non Abstract method - ClgName");
	}
}

     class clgAsma extends Collage{

		@Override
		void clgName() {
			System.out.println("clg name is = asma");
			
		}
		
}
     
public class AbstractionTest {

	public static void main (String [] args) {
		Collage C = new clgAsma();
		C.clgName();
		C.clgAddress();
	}
}
