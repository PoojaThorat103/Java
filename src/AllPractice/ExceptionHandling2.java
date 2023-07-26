package AllPractice;

class Animal12{
	
//function to check if person is eligible to vote or not   
 void validate(int age) {  
    if(age<18) {  
        //throw Arithmetic exception if not eligible to vote  
        throw new ArithmeticException("Person is not eligible to vote");    
    }  
    else {  
        System.out.println("Person is eligible to vote!!");  
    }  
}  


}



public class ExceptionHandling2 {
	
public static void main(String [] args) {
	Animal12 animal12 = new Animal12();
	animal12.validate(19);
}
}
