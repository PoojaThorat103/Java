package Pra.Porgrammes;

public class PrimeNumber {

	public static void main(String[] args) {
	   
		
		/*
		int num =8;
		boolean isPrime = true;
		for(int i =2; i<=num/2;i++) {
			if (num % i==0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime){
			System.out.println("This is prime"+num);
		}
		else {
			System.out.println("This is Not a prime"+num);
		}*/
		
		
		
		
		
		
	       /* int num = 6;
	        boolean isPrime = true;

	        for(int i = 2; i<= num/2; i++){
	            if(num % i == 0){
	                isPrime = false;
	                break;
	            }
	        }

	        if(isPrime){
	            System.out.println(num+" : Number is prime");
	        }else{
	            System.out.println(num+" : Number is not prime number");
	        }*/

// Another simple logic		
		
	// check 7 number 
		// start loop from 2 and checl till number -1 = 6, because if we take 7 then itg will be divisible by 7
		
		int number = 9;
		
		boolean isNumberPrime = true;
		
		for(int i = 2; i <= number-1; i++) {
			
			if(number%i == 0) {
				
				isNumberPrime = false;
				break;
			}
			
		}
		
		if(isNumberPrime) {
			System.out.println("This is prime number " + number);
		}
		
		else {
			System.out.println("This is Not a prime number " + number);
		}
		
		
		
		
		
	    }
	

	}

