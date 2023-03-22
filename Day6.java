import java.util.Arrays;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [] s1 = new String [3];
		s1[0]= "Nirva";
		s1[1]= "John";
		s1[2]= "Nikki";
		
		for (int i =0;i<s1.length; i++)
		{
			System.out.println(s1[i]);
		}
		String s2 = "nagpur";	
		char [] a= s2.toCharArray();
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(s1));
		
		
		for (String s :s1) {
			System.out.println(s);
		}
		
		
		int b []= new int [5];
		b[0]=1;
		b[1]=1;
		b[2]=2;;
		b[3]=3;
		b[4]=4;
		
		
		int sum =0;
		int avg=0;
		for(int i =0; i<b.length; i++) {
			sum = sum+ b[i];	
		}
		System.out.println(sum);
		avg =avg + sum/b.length;
		System.out.println(avg);
		

	}

}
