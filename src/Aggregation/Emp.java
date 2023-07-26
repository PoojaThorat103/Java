package Aggregation;

public class Emp
{
	int id ;
	String name ;
	
	Address address;
	
	public Emp(int id , String name , Address address)
	{
		this.id = id;
		this.name =  name;
		this.address =  address;
	}

	void display()
	{
		System.out.println(id+" "+name);  
		System.out.println(address.city + "" + address.country +""+ address.state);  
	}
	
	
	public static void main (String []args)
	{
		Address address1 = new Address(" pune ", " maharashtra "," india ");
		Emp Emp = new Emp(10, "pooja", address1);
		
		
		Emp.display();
	}
	
}
