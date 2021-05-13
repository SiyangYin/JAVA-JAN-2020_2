package Polymorphism;
class B1
{
	void f1(int a)
	{
		System.out.println(a);
		System.out.println("Vrushank DAD");
	}
}
public class B2 extends B1 
{
	void f1(int a)
	{
		System.out.println(a);
		System.out.println("Vrushank");
	}

	public static void main(String[] args) 
	{
		
     B2 b=new B2();
     b.f1(200);
	}

}
