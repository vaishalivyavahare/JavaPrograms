import java.util.Arrays;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] [] = new int [3][4];
		
		a[0][0]= 11;
		a[0][1]= 12;
		a[0][2]= 13;
		a[0][3]= 14;
		
		a[1][0]= 15;
		a[1][1]= 16;
		a[1][2]= 17;
		a[1][3]= 18;
		
		a[2][0]= 15;
		a[2][1]= 16;
		a[2][2]= 17;
		a[2][3]= 18;
		
		
		
		  System.out.println(a); String b=Arrays.toString(a); System.out.println(b);
		  
		  
		  for (int i =0; i<a.length ; i++) { int k[] = a[i];
		  
		  for (int j =0; j<k.length; j++) {
		  
		  System.out.println(a[i][j]); } }
		 
 
		//For Each
		 
		 for(int [] l : a)
		 {
			 for (int  m :l)
			 {
				 System.out.println(m);
			 }
		 }
         		
		 int [] [] [] number = {
				 {	 
				 
				     {1,2,3 },
				     {4,5,6},
				     {7,8,9}	
				 }   ,
				 {
				    {11,22,33 },
				    {44,55,66},
				    {77,88,99}
				 } ,
				 {
					    {111,222,333 },
					    {444,555,666},
					    {777,888,999}
				 } ,	 
		 };
		 System.out.println(number[1][1][1]);
		 
		 
		 for (int v =0; v<number.length; v++)
		 {
			 int t[][] = number[v];
			 for (int r = 0; r<t.length;r++)
			 {
				 int [] h = t[r];
				for(int u =0; u<h.length; u++) 
				{
					System.out.println(h[u]);
				}
			 }
			 
		 }
		
		 // For Each
		 
		 for(int [][] f :number)
		 {
			 for (int g [] : f)
			 {
				 for (int d :g)
				 {
					 System.out.println(d);
				 }
			 }
		 }
		 
		 
	}

}
