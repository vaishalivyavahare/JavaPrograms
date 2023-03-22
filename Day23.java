
public class Day23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Colors1.red;
		Colors1 c1 = Colors1.red;
		//c1.green;
		c1.info();
		
		Colors1 c2 = Colors1.green;
		Fruits aa [] = Fruits.values();
		for(Fruits a:aa) {
			System.out.println(a.getname());
		}
		
		
		
		
		
	}

}

enum Colors1{
	red,
	green,
	yellow;

    private Colors1()
    {
		System.out.println("QA");
    }
 public void info() {
	System.out.println("QA");
   }


}


enum Fruits{
	 ORANGE ("Yellow"),
	 MANGO ("Orange"),
	 GRAPSE ("green");
	
	
	private String name;
	
	private Fruits(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return this.name;
	}
}