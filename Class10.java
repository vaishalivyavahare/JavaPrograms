
public class Class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c= new Cal();
		c.addition(7);
		c.addition(4, 2);
		int aa =c.addition(1, 2, 3);
		System.out.println(aa);
		  
		
		

	}

}
class Cal {
	
	//Overloading 
	// same class 
		// same method  name
		// Different signature
	
	int s,y,x;
	
	public int addition(int a,int b ,int c) {
		return (a+b+c);
	}
	public void addition(int d, int e)
	{
		System.out.println(d/e);
	}
	public void addition(int f)
	{
		System.out.println(f);
	}
}