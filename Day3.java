
public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  String s ="Chinmay"; 
		  String r ="aeiou"; 
		  int count1 =0;
		  
		  for(int i =0; i< s.length(); i++) 
		  { if(s.charAt(i)== 'a' ||  s.charAt(i) =='e'|| s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i) =='u') 
		  { 
			  count1 = count1+1; 
			  }
		  }
		  System.out.println(count1);
		 
				
				
		/*
		 * String nameE = "chinmay"; String vowels = "aeiou"; int count = 0; for(int i =
		 * 0 ; i < nameE.length() ; i++) { if(nameE.charAt(i) == 'a' || nameE.charAt(i)
		 * == 'e'||nameE.charAt(i) == 'i' ||nameE.charAt(i) == 'o'|| nameE.charAt(i) ==
		 * 'u') { count = count + 1; }
		 * 
		 * } System.out.println(count);
		 */
	}

}
