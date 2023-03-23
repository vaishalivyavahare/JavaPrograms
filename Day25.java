import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Day25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="john";
		System.out.println("hello");
		
		try {
		   System.out.println(10/2);
		
		 }
		catch (ArithmeticException e ) {
			System.out.println("nubmer should not zero ");
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(name.charAt(0));
			
		}
		catch(NullPointerException e){
			System.out.println("Please initialize the value");
			
		}
		
		catch (Exception e) {
			System.out.println("Please initialize the value");
			e.printStackTrace();	
			}
		int number [] = new int[3];
		number [0]=1;
		number [1]=2;
		number [2]=3;
		
		try {
			  System.out.println(number[3]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter within the rangel");
			System.out.println(e);
			
			
		}
		try {
		       File file = new File("c\\users\\abdc.txt");
		       BufferedReader br = new BufferedReader(new FileReader(file));
		
	         	//BufferedReader br = new BufferedReader(new FileReader(file));
		
		}
		catch(FileNotFoundException e) {
			
			System.out.println("File not found");
			e.printStackTrace();
			System.out.println("please select correct path");
			
		}
		
		
		

	}

}
