package Innerclass;

class Outer2 
{
    int x=85;
    static class Inner2
    {
    	int x=65;
    	public void f1()
    	{
    		System.out.println(x);
    	}
    }
    
	public static void main(String[] args) 
	{
		Outer2.Inner2 obj=new Outer2.Inner2();
		obj.f1();
		/*Outer2 obj1=new Outer2();
        System.out.println(obj1.x);*/
	}

}
