package Static;

public class Sblock
{
	static
	{
		System.out.println("Static Block");
	}
	Sblock()
	{
		System.out.println("Local class Constructor");
	}
	{
	    System.out.println("Init Block");
	}
	public static void main(String[] args)
	{
		System.out.println("In Main Method"); 
		Sblock s=new Sblock();

	}

}
