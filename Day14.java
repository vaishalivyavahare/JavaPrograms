//Abstraction
//1. We can not create object of abstract class
//2.Abstract class should have 1 abstract method
//
public class Day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		SBIa sba=new SBIa("pune", "india");
		sba.save();
		sba.loan();
		System.out.println(sba.city);	
		System.out.println(sba.country);
	}

}

 abstract class WorldBanka
{
	String city;
	String country;
	WorldBanka(String city,String country)
	{
		this.city=city;
		this.country=country;
	}
	
	abstract void save();
	abstract public void loan();
}
 
 class SBIa extends WorldBanka
 { 
	  int intestrate;

	SBIa(String city, String country) {
		super(city, country);
		this.intestrate=intestrate;
		
	}

	@Override
	void save() {
		System.out.println("sbi saving account");
		
	}

	@Override
	public void loan() {
		
		System.out.println("sbi loan");
	}
	 
 }