package Abstract;
abstract class Bike
{
	abstract void f1();
	abstract void f2();
}
public class Honda extends Bike
{
	void f1()
	{
		System.out.println("Honda1");
	}
	void f2()
	{
		System.out.println("Honda2");
	}
	public static void main(String[] args) 
	{
		
		Bike ob=new Honda();
		ob.f1();
		ob.f2();
	}

}
