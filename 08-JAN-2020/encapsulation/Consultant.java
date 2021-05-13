package encapsulation;

public class Consultant 
{

	public static void main(String[] args) 
	{
		Bank b=new Bank();
		b.setAccount(123456);
		b.setBankname("AXIS Bank");
		b.setIfsccode("AXIS00045");  
		System.out.println("Account Number is: "+b.getAccount());
		System.out.println("Bank Name is: "+b.getBankname());
		System.out.println("IFSC Code is: "+b.getIfsccode());

	}

}
