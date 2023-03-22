
public class Day20 {

	
	// singleton class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student s= new Student();
		Student.createInstance();		

	}

}
class Student
{
	String Name;
	static Student s;
	
	private Student() {
		
	}
	public static Student createInstance()
	{
		if (s==null) {
			System.out.println("hello");
			s=new Student();
		}
		return s;
	}
}