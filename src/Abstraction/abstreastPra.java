package Abstraction;

abstract class Std {
	
	abstract void NoOfStu();
	abstract void Sub();
	void stdTest() {
		System.out.println(" this is std class ");
	}
}


class FirstStd extends Std{
	void NoOfStu() {
		System.out.println(" 1st class - 40 students");
	}

	@Override
	void Sub() {
		System.out.println(" 1st class sub -  English");	
		
	}
}

class SecondClass extends Std{
	
	void NoOfStu() {
		System.out.println(" 2st class - 20 students");
	}

	@Override
	void Sub() {
		System.out.println(" 2st class sub -  English , Hindi");		
	}	
	
	 void test(){
		System.out.println("2st -  test ");
	}
}

 public class abstreastPra
 {
	 public static void main (String [] args)
	 {
		 Std s = new SecondClass();
		 s.NoOfStu();
		 
		 s.stdTest(); // non abstract method.
		 SecondClass s2 =  new SecondClass();
		 s2.test();

		// Std Std = new Std(); // can not instantiate abstract class 
	 }
 }
 
 
