package Polymorphism;

public class Constructoroverloading 
{

	Constructoroverloading(int a)
	    {
	    	System.out.println(a);
	    	System.out.println("Hi");
	    }
	Constructoroverloading(int a,int b)
	    {
	    	System.out.println(a+b);
	    	System.out.println("Hello");
	    }
	Constructoroverloading(String a,int c)
	    {
	    	System.out.println(a+" "+c);
	    	System.out.println("Bye");
	    }
		public static void main(String[] args) 
		{
			Constructoroverloading m1=new Constructoroverloading(100,200);
			Constructoroverloading m2=new Constructoroverloading(500);
			Constructoroverloading m3=new Constructoroverloading("ABCD",90);
		}

}