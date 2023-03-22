
public class Day19 {

	public static void main(String[] args) {
		// TODO Auto-generated methosd stub
		Suject s= new Suject();
		Suject.English e = s.new English();
		Suject.Marathi m = s.new Marathi();
		e.subjectDetails();
		m.subjectDetails();
		
		

	}

}
class Suject{
	String srno;
	
	class English{
		
		int days;
		String booksname;
		public void subjectDetails()
		{
			System.out.println("English is having 4 books to learn");
		}
	}
	class Marathi{
		int days;
		String booksname;
		
		public void subjectDetails()
		{
			System.out.println("Marathi is having 6 books to learn");
		}
	}
}