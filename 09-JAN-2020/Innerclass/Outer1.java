package Innerclass;

class Outer1 
{
    public void f1()
    {
    	class Inner1
    	{
    		public void sum(int x,int y)
    		{
    			System.out.println(x+y);
    		}
    	}
    	Inner1 i=new Inner1();
    	i.sum(100, 200);
    	i.sum(1000, 2000);
    	i.sum(10, 20);
    }
    public static void main(String[] args) 
	{
    Outer1 o=new Outer1();
    o.f1();
	}

}
