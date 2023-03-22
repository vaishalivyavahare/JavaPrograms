
public class Day24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a[] = new int [2];
			a[0]=1;
			a[1]=2;
			a[2]=3;
			
			
			System.out.println(a[2]);
			System.out.println(10/2);
		}
		catch (ArithmeticException e) {
			
			System.out.println("error");
			System.out.println("incorrect input from user");
		}
		catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
		finally {
			System.out.println("it will execute always");
		}
		
		
		
		
		
		
	}

}
