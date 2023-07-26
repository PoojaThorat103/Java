package StaticKeyword;

class School{
	
	int rollno = 12; 
    static String schoolName =  "ABC";   
	
    // Static method  
    static void info() {
   
    	schoolName = "AAA";
    	
    	// The static method can not use non static data member : give compile time error
    	//rollno =3; 
    	//System.out.println("Static M"+rollno );
    	
    }
    
    
    // Non-Static method
    void sudentInfo() {
    	System.out.println("Non-Static M " +  schoolName);
    }
    
    
    void print() {
    	System.out.println("====" + schoolName);
    }
}





public class Pra {

	public static void main(String[] args) {
		
		School.info(); // calling static method
		
		School school = new School();
		school.sudentInfo();
		school.print();
		
	}

}
