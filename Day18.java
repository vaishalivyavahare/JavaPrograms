
public class Day18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 c =new Car1("fourwheeler", "BMW");
		Car1.Auto h = c.new Auto();
		//h.displayEngine();
		h.typeBase();
		h.displayEngine();
		
		
		Grocery g =new Grocery();
		Grocery.Fruits f = g.new Fruits();
		f.City();
		Grocery.Vegitable v = g.new Vegitable();
		v.City();
		

	}

}
class Car1{
	String name;
	String ty;
	 Car1 (String name,String ty) {
		this.name=name;
		this.ty=ty;
	}

class Auto {
	String engine;
	public String typeBase() {
		if(Car1.this.ty.equals("SUV")) {
			this.engine="Small";
			//System.out.println("good");
		}
		else if(Car1.this.ty.equals("BMW"))
		{
			//System.out.println("bigger");
			this.engine="Bigger";
			
		}
		else {
			System.out.println("default");
		}
	    return engine;
	
	}
	void displayEngine() {
		System.out.println(this.engine);
	}
	
}
}



class Grocery{
	
	String a;
	int price;
	
	class Fruits{
		
		String supplier;
		String vender;
		public void City() {
			System.out.println("pune");
		}
	}
	protected class Vegitable{
		String a;
		String supplier;
		String vender;
		
		public void City()
		{
			System.out.println("mumbai");
		}
	}
	
}