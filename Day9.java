
public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonD[] d = {
				new PersonD("Jyoti","Zha",27)
				
		};
		
		d[0].display();
		
		
		Car[] c= {
				new Car("maruti", 12, "Alto800") , new Car("Honda", 14, "City")
		};
		c[0].displayDetails();
		c[1].displayDetails();
				
				}

}
class PersonD {
	String name;
	String lastname;
    int age;
    
    
    PersonD(String name,String lastname,int age)
    {
    	this.name=name;
    	this.lastname=lastname;
    	this.age=age;
    }
    public void display() {
    	System.out.println(name );
    	System.out.println(lastname );
    	System.out.println(age );
    }
}




class Car
{
	String Name;
	int number;
	String model;
	
	Car(String Name,int number,String model){
		this.Name=Name;
		this.number=number;
		this.model=model;
	}
	public void displayDetails()
	{
		System.out.println(Name);
		System.out.println(model);
		System.out.println(number);
	}
	
}

