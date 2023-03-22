
public class Day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f= new Father("govind","ahuzha",40);
		Child c =new Child("Anil" , "Kumar" , "shetty", 45);
		f.displayDetails();
		c.displayDetails();
		
		
		Mother m= new Mother("Suman","Vyavahare", 45);
		Dauther1 d = new Dauther1("Kavya","Dome",32, "Kamal");
		Dauther2 d2 = new Dauther2("Divya","kome",12, "Indu");
		m.display();
		d.display();
		d2.display();
		
		
		System.out.println(d.dauthername);

	}

}
class Father{
	String fristname;
	String Lastname;
	int age;
	
	Father(String fristname,String Lastname,int age){
		this.fristname=fristname;
		this.Lastname=Lastname;
		this.age=age;
		
	}
	public void displayDetails() {
		System.out.println(fristname);
		System.out.println(Lastname);
		System.out.println(age);
	}
	
}
class Child extends Father{
	String cname;
	Child (String Lastname,String fristname,String childname,int age){
		super ( fristname, Lastname,age);
	    this.cname=childname;
	}
	
	public void displayDetails() {
		System.out.println(cname);
		System.out.println(fristname);
		System.out.println(Lastname);
		System.out.println(age);
		
		
	}
}


// Hirearchcally
 // 1 parent 2 child

class Mother{
	String Fristname;
	String Lastname;
	int age;
	Mother(String Fristname,String Lastname,int age){
		this.Fristname=Fristname;
		this.Lastname=Lastname;
		this.age=age;
	}
	public void display()
	{
		System.out.println(Fristname+   Lastname + age  );
	}
	
}
class Dauther1 extends Mother{
	String dauthername;
	
	Dauther1(String Fristname,String Lastname,int age, String dauthername){
		super(Fristname , Lastname , age);
		this.dauthername= dauthername;
    }
	
	public  void display() {
		System.out.println(dauthername); 
	}
}
class Dauther2 extends Mother{
	String dauthername;
	Dauther2(String Fristname,String Lastname,int age, String dauthername){
		super(Fristname , Lastname , age);
		this.dauthername= dauthername;
	}	
	
	public void display() {
		System.out.println(dauthername);
	}
}











