package Pra.Porgrammes;

public class ReverseOfNumber {

	  public static void main(String[] args){

	        /*int num = 1313;
	        int rev = 0;

	        while(num != 0){
	            int reminder = num % 10;
	            rev = rev * 10 + reminder;
	            num = num / 10;
	        }
	        System.out.println(rev);*/
		  
		  
		  
		  
		  // Another Logic 
		  	  
		  int number = 1234;
		  int rem, rev = 0;
		  
		  while(number !=0) {
			  rem = number % 10;
			  rev = rev*10+rem;
			  number=number/10;
		  }
		  
		  System.out.println(rev);
		  
		  
		  
		  
		  
	    }
}

