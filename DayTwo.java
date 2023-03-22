
public class DayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s= "HELLO";
		String s1 = "hello";
		
		
		//1. Properties / Methods of String
		// length() , concat(), toUpperCase(), toLowerCase(), equals(),  equalsIgnoreCase() ,  startsWith() , endsWith() , contains() , 
		
		int l =s.length();
		System.out.println(l);
		
		String c = s.concat(s1);
		System.out.println(c);
		
		String u = s.toUpperCase();
		System.out.println(u);
		
		String ll = s.toLowerCase();
		System.out.println(ll);
		
		boolean b = s.equals(s1);
		System.out.println(b);
		
		
		Boolean q =s.startsWith("H");
		System.out.println(q);
		
		Boolean e = s.equalsIgnoreCase(s1);
		System.out.println(e);
		
		
		

	}

}
