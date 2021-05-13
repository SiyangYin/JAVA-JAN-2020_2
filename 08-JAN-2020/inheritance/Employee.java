package inheritance;

public class Employee
{
    int eid;
    String ename;
    Bank bank;
    public Employee(int eid,String ename,Bank bank)
    {
    	this.eid=eid;
    	this.ename=ename;
    	this.bank=bank;
    }
    void displayvalues()
    {
    	System.out.println(eid+" "+ename);
    	System.out.println(bank.accountno+" "+bank.bname+" "+bank.ifsccode);
    }
	public static void main(String[] args) 
	{
		Bank b1=new Bank(1234,"BOA","BOA0085"),b2=new Bank(1245,"BOC","BOC0075");
		Employee e1=new Employee(101,"Peng",b1),e2=new Employee(102,"Song",b2);
        e1.displayvalues();
        e2.displayvalues();
	}

}
