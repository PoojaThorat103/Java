package AllPractice;

class School{
	
	School(){
		System.out.println("School constructor");
	}
	
	
}



class ABCSchool extends School{
	
	ABCSchool(){
		super();// Note: super() is added in each class constructor automatically by compiler if there is no super() or this().
		System.out.println("ABCSchool constructor");
	}
	
	
}





public class SuperKeywordConstructor {
	public static void main (String [] args) {
		
		ABCSchool ABCSchool = new ABCSchool();
	}

}
