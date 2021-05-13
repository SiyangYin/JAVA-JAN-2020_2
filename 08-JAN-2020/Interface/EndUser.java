package Interface;
interface Car
{
	void setName(String a);
	String getName();
	void setGears(int b);
	int getGears();
	void setMileage(int c);
	int getMileage();
}
class Santro implements Car
{
	String a;
	int b,c;
	public void setName(String a)
	{
		this.a=a;
	}
	public String getName()
	{
		return a;
	}
	public void setGears(int b)
	{
		this.b=b;
	}
	public int getGears()
	{
		return b;
	}
	public void setMileage(int c)
	{
		this.c=c;
	}
	public int getMileage()
	{
		return c;
	}
}
class Alto implements Car
{
	String a;
	int b,c;
	public void setName(String a)
	{
		this.a=a;
	}
	public String getName()
	{
		return a;
	}
	public void setGears(int b)
	{
		this.b=b;
	}
	public int getGears()
	{
		return b;
	}
	public void setMileage(int c)
	{
		this.c=c;
	}
	public int getMileage()
	{
		return c;
	}
}
public class EndUser
{

	public static void main(String[] args)
	{
		Santro s=new Santro();
		System.out.println("Enter the Details of Santro:");
		s.setName("ABC");
		s.setGears(4);
		s.setMileage(15);
		System.out.println("----------Details are :-----------");
		System.out.println(s.getName()+" "+s.getGears()+" "+s.getMileage());
		Alto a=new Alto();
		System.out.println("Enter the Details of Alto:");
		a.setName("XYZ");
		a.setGears(5);
		a.setMileage(18);
		System.out.println("----------Details are :-----------");
		System.out.println(a.getName()+" "+a.getGears()+" "+a.getMileage());
	}

}
