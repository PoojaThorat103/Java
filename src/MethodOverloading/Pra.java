package MethodOverloading;

class Addition{
	
	public int add(int a, int b) {		
		
		int addition = a+b;
		return addition;
	
	}
	
	
	public int add(int a, int b, int c) {
		int addition = a+b+c;
		return addition;
	}
	
	public double  add(double  a, double  b) {
		double  addition = a+b;
		return addition;
	}
	
	
}



public class Pra {
	public static void main(String[] args) {
		Addition addition = new Addition();
		
		System.out.println(addition.add(12, 12));
		System.out.println(addition.add(11.11, 11.11));
		
	}
	

}
