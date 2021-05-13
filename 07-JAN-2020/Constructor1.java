
public class Constructor1
{
	Constructor1()
	{
	System.out.println("Welcome to Constructor");
	}
	Constructor1(String a,int b)
	{
		System.out.println(a+" "+b);
	}

	public static void main(String[] args)
	{
		Constructor1 c=new Constructor1(),c1=new Constructor1("Marlabs",200);
		
	}

}
