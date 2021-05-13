class X
{
	int e=111,f=222;
	X()
	{
		System.out.println("Default Constructor");
	}
	X(String s)
	{
		System.out.println(s);
	}
	void f1(int a,int b,int c,int d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}
public class Y 
{

	public static void main(String[] args)
	{
		X obj=new X(),obj1=new X("Parameterized"),obj2=new X(),obj3=new X(),obj4=new X();
        obj.f1(300,400,500,600);
        System.out.println(obj.e);
        obj1.e=1111;
        System.out.println(obj1.e);
        obj2.e=11111;
        System.out.println(obj2.e);
        obj3.e=111111;
        System.out.println(obj3.e);
        obj4.e=1111111;
        System.out.println(obj4.e);
        System.out.println(obj.f); 
        obj1.f=2222;
        System.out.println(obj1.f);
	}

}
