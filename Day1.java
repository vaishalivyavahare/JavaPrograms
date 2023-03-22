
public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1 d =new Day1();
		d.Addition(5, 5);
		int c= d.Addition1(4, 3);
		System.out.println(c);

		
	}

	//1 Function with parameter no return value
	
	public void Addition(int a , int b)
	{
		System.out.println(a+b);
	}
	//2 Function with parameter with return value
	public int Addition1(int x , int y)
	{
		return x+y;
	}
	
	
}


	