
public class Day16all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		G g = new G();
		g.display();
		g.main();
		g.hello();

		
		
	}

}
interface WB
{
	public void save();
	public void discount();
	
}
abstract class SBIb
{
	String a;
	String b;
	abstract public void loan();
	abstract public void intrestrate();
}
class ICICI extends SBIb implements WB
{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}

	@Override
	public void discount() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	@Override
	public void intrestrate() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}
	
}

interface D
{
	public void main();
	public void display();
	default void message()
	{
		System.out.println("defalt method");
	}
	
}
interface F extends D
{
	public void hello();
	
	
}
class G implements D,F
{

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}

	@Override
	public void main() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	
}








