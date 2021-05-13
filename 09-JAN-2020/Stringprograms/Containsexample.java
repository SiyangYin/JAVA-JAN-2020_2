package Stringprograms;

public class Containsexample 
{

	public static void main(String[] args)
	{
     String s="hello how are you wat you doing";
     System.out.println(s.contains("how"));
     System.out.println(s.contains("hi"));
     System.out.println(s.contains("are you"));
     System.out.println(s.contains("wat"));
     String s1="My company website is www.marlabs.com";
     if(s1.contains("marlabs.com"))
     {
    	 System.out.println("The String contains marlabs.com");
     }
     else
    	 System.out.println("Result not found");
	}

}
