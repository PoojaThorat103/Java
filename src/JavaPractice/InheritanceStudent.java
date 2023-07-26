package JavaPractice;

public class InheritanceStudent extends InheritanceTeacher {

	String name = "pooja";

	public static void main(String[] args) {

		InheritanceStudent Stu1 = new InheritanceStudent();
		System.out.println("Subject name is " + Stu1.Subject);
		System.out.println("Student name is " + Stu1.name);

		System.out.println("attand lacture in a week - " + Stu1.lacturesGiven(3, 5));
	}

}
