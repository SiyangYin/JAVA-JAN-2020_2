package ExceptionHandling;

public class Numberformatexample 
{

	public static void main(String[] args) 
	{
		try
		{
			String b="200a";
			int c=Integer.parseInt(b);
			System.out.println(c);
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Give numbers only");
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
