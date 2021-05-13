package ExceptionHandling;

public class Nullpointexample 
{

	public static void main(String[] args) 
	{
		try
		{
			String a="abcdefgh";
			System.out.println(a.length());
		}
		catch(NullPointerException ne)
		{
			System.out.println("Give values except null");
		}
		catch(Exception e1)
		{
			e1.getMessage();
		}
		finally
		{
			System.out.println("In Finally Block");
		}

	}

}
