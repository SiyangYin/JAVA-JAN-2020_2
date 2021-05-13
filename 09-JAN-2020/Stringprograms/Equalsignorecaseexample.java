package Stringprograms;

public class Equalsignorecaseexample 
{

	public static void main(String[] args)
	{
		String s1="java";
		String s2="java";
		String s3="JAVA";
		String s4="python";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));

	}

}
