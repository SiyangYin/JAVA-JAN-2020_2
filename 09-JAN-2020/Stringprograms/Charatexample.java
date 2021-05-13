package Stringprograms;

public class Charatexample 
{
	public static void main(String args[])
	{
		String s1="javabyNagendra";
		char ch=s1.charAt(5);
		// Returns the char value in 5th index
		System.out.println(ch);
		String s2="12349876";
		int a=s2.length();
		System.out.println(a);
		System.out.println(s2.charAt(0));
		System.out.println(s2.charAt(1));
		System.out.println(s2.charAt(a-1));
		System.out.println(s2.charAt(a-2));
		System.out.println(s2.charAt(a-3));
	}

}
