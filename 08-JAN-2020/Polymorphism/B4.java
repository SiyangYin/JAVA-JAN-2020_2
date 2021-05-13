package Polymorphism;

class B3
{
	void f1(int a)
	{
		System.out.println(a);
		System.out.println("This is B3 Class");
	}
}
public class B4 extends B3 
{
	void f1(int a)
	{
		super.f1(a);
		System.out.println(a);
		System.out.println("This is B4 Class");
		
	}

	public static void main(String[] args) 
	{
		
     B4 b=new B4();
     b.f1(200);
	}

}
