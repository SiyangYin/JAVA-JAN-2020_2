package packageA;

class C1 
{
	int a=100;
// private int a=100;
// private void f1()
void f1()
{
	System.out.println("Welcome to Private");
}
}
public class C
{
	public static void main(String[] args)
	{
		C1 obj=new C1();
		System.out.println(obj.a);
		obj.f1();
	}

}
