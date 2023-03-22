
public class Day4 {

	public static void main(String[] args) {
		int d = 0;
		
		
		String s1 = "        Vaishali";
		String s2 ="Trisha"      ;
		
		int q1 = s1.indexOf("a");
		int q2 = s2.length();
		
		System.out.println(q1);
		System.out.println(q2);
		
		

		int q3 = s1.compareTo(s2);
		System.out.println(q3);
		
		String q4 = String.join("@ " ,s1,  s2);
		System.out.println(q4);
		
		int q5 = s1.indexOf("i");
		System.out.println(q5);
		
		
		for(int i=0; i<s1.length(); i++)
		{
		 if(s1.charAt(i)=='i') {
			 System.out.println(i);
		  
		 }
		}
		
		
		String q6 = s1.trim();
		System.out.println(q6);
		 
		//System.out.println(d);
		String q7 = s2.trim();
		System.out.println(q7);
		
		
		String q8 =s1.replace('a', 'i');
		System.out.println(q8);
		
		String s3 = "";
		boolean b = s3.isEmpty();
		System.out.println(b);
		
	}

}
