
public class Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Poorva";
		System.out.println(s);
		char b[]  =s.toCharArray();
		for (int i =0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		
		String city = "Nagpoor";
		switch (city)
		{
		case "pune" :
		       System.out.println("maharashtra");
		case "mumbai":
			   System.out.println("mh");
		case "indor":
			   System.out.println("GU");
		case "Nagpoor":
			  System.out.println("maharshtra");  
		default :
			System.out.println("Hello");
		}
		String city1 = "Nagpoor";
		switch (city1)
		{
		case "pune" :
		       System.out.println("maharashtra");
		       break;
		case "mumbai":
			   System.out.println("mh");
			   break;
		case "indor":
			   System.out.println("GU");
			   break;
		case "Nagpoor":
			  System.out.println("maharshtar");  
			  break;
		default :
			System.out.println("Hello");
		}
		
		int r=1;
		while(r<=8)
		{
			if(r==2) {
				r++;
				continue;
			
			}
		System.out.println(r);
		r=r+1;
		}
	
	int q=1;
	while(q<=5)
	{
		if(q==3)
		{
			q++;
			break;
		}
		System.out.println(q);
		q++;
	}
	
	
	
	
	}
	
	

}
