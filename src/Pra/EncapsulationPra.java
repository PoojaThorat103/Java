package Pra;

class Company{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}





public class EncapsulationPra {
	
 public static void main (String [] args) {
	 Company c = new Company();
	 c.setName("Pooja");
	 System.out.println(c.getName());
	 
 }
}
