package Polymorphism;

public class Methodoverloading
{
    void f1(int a)
    {
    	System.out.println(a);
    	System.out.println("Hi");
    }
    void f1(int a,int b)
    {
    	System.out.println(a+b);
    	System.out.println("Hello");
    }
    void f1(String a,int c)
    {
    	System.out.println(a+" "+c);
    	System.out.println("Bye");
    }
	public static void main(String[] args) 
	{
		Methodoverloading m=new Methodoverloading();
		m.f1(10,20);
		m.f1(200);
		m.f1("abcdefgh",35);
	}

}
