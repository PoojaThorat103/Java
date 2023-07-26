package CollectionTest;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	
	Student(int rollno, String name , int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;		
	}
	
	public int compareTo(Student st) {
		// comparing age
		
		/*if(age == st.age)
		return 0;				
		else if(age > st.age)
		return 1;		
		else
		return -1;*/
				
		// comparing rollno
		
		if(rollno == st.rollno)
		return 0 ;		
		else if (rollno > st.rollno)
		return 1;	
		else
		return -1;
	}
	
}

// ----------------------------------------------------------- Test class ---------

public class ComparableTest {

	public static void main (String [] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(30 ,"pooja" , 28));
		al.add(new Student(21, "sahil" , 30));
		al.add(new Student (11, "nama" , 1));
		
		//Collections.sort(al);  // assending order
		Collections.reverseOrder(); // decending odrer
		
		for(Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
	
	
}
