package Pra;

public class EncapsulationProgram {
	
	private String name;	
	private String Addreass;
	private  int Id; 
	private int age;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddreass() {
		return Addreass;
	}

	public void setAddreass(String addreass) {
		Addreass = addreass;
	}
	
	public void setage(int age) {
		this.age = age;
		if (age>18 & age<60) {
				System.out.println(age);
		}
		
		else {
			System.out.println("Invalid age");
		}
	}
	
	public int getage() {
		return age;
		
	}
	

}
