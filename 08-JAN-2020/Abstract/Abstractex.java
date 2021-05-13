package Abstract;
abstract class A1
{
	int a=10;
	A1()
	{
		System.out.println("In A1 Class");
	}
	void f1()
	{
		System.out.println("In f1 Method");
	}
	abstract void f2();
	abstract void f3();
}
public class Abstractex extends A1
{
	void f2()
	{
		System.out.println("In f2 Method");
	}
	void f3()
	{
		System.out.println("In f3 Method");
	}
	public static void main(String[] args) 
	{
		A1 obj=new Abstractex(); // Factory Method
		obj.f1();
		obj.f2();
		obj.f3();
        System.out.println(obj.a);
	}

}
