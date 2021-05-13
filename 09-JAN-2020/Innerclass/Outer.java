package Innerclass;

class Outer
{
    int a=100;
    class Inner
    {
    	int a=200;
    	public void f1()
    	{
    		int a=300;
    		System.out.println(a);
    		System.out.println(this.a);
    		System.out.println(Outer.this.a);
    	}
    }
	public static void main(String[] args)
	{
		
     new Outer().new Inner().f1();
	}

}
