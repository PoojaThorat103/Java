package AllPractice;



class Animal9{
	// Read-Only class
	private int age = 10;

	public int getAge() {
		return age;
	}

//	Write-Only class
	private String name;

	
	public void setName(String name) {
		this.name = name;
	}
	

}













public class EncapsulationTest2 {
	public static void main (String [] args) {
		
		Animal9 animal9 = new Animal9();
		System.out.println(animal9.getAge());
	//	animal9.setAge(4);    // will render compile time error  
		
		
		animal9.setName("DOG");
	//	System.out.println(animal9.getName);   //Compile Time Error, because there is no such method  
	//	System.out.println(animal9.name);  // Compile Time Error, because the college data member is private.   
											//So, it can't be accessed from outside the class  
	}

}
