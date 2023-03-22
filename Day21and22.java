
public class Day21and22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Colors.Green);
		System.out.println(Colors.red);
		Test t = new Test(Day.sun);
		t.Display();
		t.display(Day.mon);
		
		
		

	}

}
enum Colors{
	Green,
	red,
	Yellow;
	
}
  
enum Day{
	sun,mon,tues,wed,thu,fri,sat;
 }
class Test{
	
	Day day;
	public Test(Day day) {
		this.day=day;
	}
	public void Display() {
		switch (day) {
		case sun: System.out.println("sun");
		          break;
		case mon:
			System.out.println("mon");
			break;
		case tues:
			System.out.println("thesday");
			break;
		case wed:
			System.out.println("wednesday");
			break;
		case thu:
			System.out.println("thursday");	
			break;
		case fri:
			System.out.println("friday");
			break;
		case sat:
			System.out.println("saurday");
			break;
			default : System.out.println("weekday");
			
			
			
		}
		
	}
	
	// using if else
	
	public void display(Day a) {
		
		if(Day.sun==a) {
			System.out.println("welcom");}
			else if(Day.mon==a)
			{
				System.out.println("to pune");
			}
			else if(Day.tues==a) {
				System.out.println("for");
			}
			else if (Day.wed==a) {
				System.out.println("onbording");
			}
			else if (Day.thu==a) {
				System.out.println("in");
			}
			else if (Day.fri==a) {
				System.out.println("infosys");
			}
			else
				System.out.println("QA");
		}
	}
	
	
	
	
	
	
	
