package Static;

public class Smethod 
{
int a1,b1;
static String name="ABC";
Smethod(int a2,int b2)
{
	a1=a2;
	b1=b2;
	System.out.println(a1+" "+b1+" "+name);
}
static void change()
{
	name="USA";
}
	public static void main(String[] args) 
	{
		Smethod.change();
		Smethod sm=new Smethod(100,200);
		
	}

}
