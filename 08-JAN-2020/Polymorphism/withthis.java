package Polymorphism;

public class withthis 
{
	int eid=9876;
    String ename="Wang";
    String bank="ICICI";
    void f1(int eid,String ename,String bank)
    {
    	this.eid=eid;
    	this.ename=ename;
    	this.bank=bank;
    }
    void displayvalues()
    {
    	System.out.println(eid+" "+ename+" "+bank);
    	
    }
	public static void main(String[] args) 
	{
		withthis w=new withthis();
		w.f1(5432,"jingjie","HDFC");
		w.displayvalues();
	}
}
