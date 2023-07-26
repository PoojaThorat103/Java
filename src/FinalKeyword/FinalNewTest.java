package FinalKeyword;

final class Student{
	
final int age = 30;// can not change value
 final int number;
void ageDetails( ) {
//age = 40;  //  compile time error as variable is final so can not change the value 
//System.out.println(age);
  }

final void rollNo() {
	System.out.println("This is rollNo Method");
}

Student(){
	//age = 60; //If final veriable is blank than - You can initialize a blank final variable in constructor 
	System.out.println("This is constructor");
	number = 80;
}


}

/*class Teacher extends Student{ // student class can not extend becase it is final and we can't inherite / extends final class.
	
	void rollNo() // compile time error as method is final so we can not override
	{
		System.out.println("Teacher don't have roll No.");
	}
}*/




public class FinalNewTest {
	 public static void main(String [] args) {
		 Student s1 = new Student();
		s1.ageDetails();
		//Teacher t1 = new Teacher();
		//t1.rollNo();
	 }
	
}
