package Stringprograms;

public class Isemptyexample {

	public static void main(String[] args)
	{
		String s1="";
		String s2="marlabs";
		if(s1.length()==0 || s1.isEmpty())
			// Either the Length is Zero or isEmpty is true
		{
			System.out.println("String s1 is empty");
		}
		else
			System.out.println(s1);
		if(s2.length()==0 || s2.isEmpty())
		{
			System.out.println("String s2 is empty");
		}
		else
			System.out.println(s2);
	}

}
