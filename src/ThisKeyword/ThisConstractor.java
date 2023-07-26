package ThisKeyword;

public class ThisConstractor 
{
	String country ;
	String city ;
	String area ;
	 
	ThisConstractor(){
		System.out.println("Default");
	}
	
	ThisConstractor(String country ,String city  )
	{ this();
		this.country = country ;
		this.city = city ;
	}
	
	ThisConstractor(String country ,String city , String area)
	{
		this(country,city);//reusing constructor  // Rule: Call to this() must be the first statement in constructor.
		this.area = area;
	}
	
	void display()
	{
		System.out.println(country  + " " +   city +  "  "  + area);
	}
}
