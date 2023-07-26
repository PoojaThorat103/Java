package ThisKeyword;


/*
Usage of java this keyword
Here is given the 6 usage of java this keyword.

this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
this can be passed as argument in the constructor call.
this can be used to return the current class instance from the method.*/


//his can be used to refer current class instance variable.
public class Student 

{
	int rollNumber;
	String name;
	float fee;
	
	
	/*Student(int rollNumber,String name,float fee )
	{
		this.rollNumber = rollNumber;
		this.name = name;
		this.fee = fee;
	}
	*/
	void display()
	{
		System.out.println(rollNumber + " "  +  name + " " +  fee);
	}
	
	
	//If local variables(formal arguments) and instance variables are different, there is no need to use this keyword like in the following program:
	
	Student(int r , String n , float f)
	{
		rollNumber = r;
		name = n;
		fee = f;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
