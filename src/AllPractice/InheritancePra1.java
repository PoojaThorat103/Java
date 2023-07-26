package AllPractice;

//Hierarchical Inheritance Example

class Company{
	
		void companyRules() {
		System.out.println("This is company rules");}	
}
		
	
class ABCCompany extends Company{
	
		void ABCcompanyRules() {
		System.out.println("This is ABC Company rules");}
}
	
	
class XyzCompany extends Company{
	
		void XyzCompanyRules() {
		System.out.println("This is Xyz Companyy rules");}
}
	




public class InheritancePra1 {
	
	public static void main(String[] args) {
		
		XyzCompany xyz = new XyzCompany();
		xyz.XyzCompanyRules();
		//xyz.ABCcompanyRules(); // Compile time error 
		xyz.companyRules();
		
	}

}


/*
Note :
	
	
	Why multiple inheritance is not supported in java?
	To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
	Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.
	Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. So whether you have same method or different, there will be compile time error.

Example : 
			class A{  
			void msg(){System.out.println("Hello");}  
			}  
			class B{  
			void msg(){System.out.println("Welcome");}  
			}  
			class C extends A,B{//suppose if it were  
			   
			 public static void main(String args[]){  
			   C obj=new C();  
			   obj.msg();//Now which msg() method would be invoked?  
			}  
			}  
			Test it Now*/