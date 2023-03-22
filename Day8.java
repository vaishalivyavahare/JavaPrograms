
public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p =new Person ("Vaishali", "Dome" , 27);
		p.display();
		p.age=23;
		p.name="Vyas";
		p.lastname="Jack";
		System.out.println(p.age+ p.name);
		
		

	}

}

class Person {
	String name;
	String lastname;
	int age;
	
	public Person(String name, String lastname,int age)
	{
		this.name=name;
		this.lastname=lastname;
		this.age=age;
	}
	public void display () {
		
		System.out.println(name);
		System.out.println(lastname);
		System.out.println(age);
	}
}