
public class Day12And13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WorldBank wb= new WorldBank("pune12", "pune");
		wb.loan(3);
		wb.worldBankLoan(4, 200);
		
		SBI sb= new SBI("mumbai","bombay" ,6);
		sb.loan(5);
		sb.worldBankLoan(1, 2);

	}

}

class WorldBank
{
	String address;
	String city;
	WorldBank(String address,String city)
	{
		this.address=address;
		this.city=city;
	}
	public void loan(int z) {
		System.out.println("World Bank Loan");
	}
	public void worldBankLoan(int x,int loanamount) {
		System.out.println("intrest rate" + x);
		System.out.println(loanamount);
		
		
		
	}
}


class SBI extends WorldBank{
	int loanamount;
	SBI(String address,String city,int loanamount)
	
	{
		super (address,city);
		this.loanamount=loanamount;
   }
	
	public void loan(int y)
	{
		System.out.println(loanamount);
		 super.loan(y-2);
		
	}
	public void worldBankLoan(float intrestrate,double loanamount) {
		System.out.println("intrestrate of SBI" + intrestrate );
		System.out.println(loanamount);
		
	}
}





