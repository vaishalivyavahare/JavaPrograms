
public class Day17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticKeyWord sk = new StaticKeyWord(3);
		sk.display();
		sk.displayName();
		StaticKeyWord.display();
		StaticKeyWord.displayName();
		
		
		Humans a = new Humans("chinmay","12");
		Humans b = new Humans("chinmay","13");
		Humans c = new Humans("chinmay","11");

		
		//System.out.println(Humans.objectCount);
		
		Humans.countObj();
		

	}

}
class StaticKeyWord 
{
	int age;
	static String name="john";
	StaticKeyWord(int age)
	{
		this.age=age;
		
	}
	public static void display()
	{
		System.out.println("display method");
	}
	public static void displayName()
	{
		System.out.println(StaticKeyWord.name);
	}
}






class Humans {
	
	static int objectCount = 0  ;
	String fullName;
	String age ;
	
	
	public Humans(String fullName , String age) {
		this.fullName = fullName;
		this.age = age;	
		//objectCount = objectCount+ 1;
		increaseObjCount();
	}
	
	public  static void countObj() {
		System.out.println(Humans.objectCount);
	}
	
	public  static void increaseObjCount() {
		objectCount = objectCount+ 1;
	}
	
	
}