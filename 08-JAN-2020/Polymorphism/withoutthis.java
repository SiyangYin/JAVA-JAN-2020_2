package Polymorphism;

public class withoutthis
{

	int eid=9876;
    String ename="Wang";
    String bank="ICICI";
    void f1(int eid,String ename,String bank)
    {
    	eid=eid;
    	ename=ename;
    	bank=bank;
    }
    void displayvalues()
    {
    	System.out.println(eid+" "+ename+" "+bank);
    	
    }
	public static void main(String[] args) 
	{
		withoutthis w=new withoutthis();
		w.f1(5432,"jingjie","HDFC");
		w.displayvalues();
	}

}
