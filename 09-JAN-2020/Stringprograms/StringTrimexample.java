package Stringprograms;

public class StringTrimexample {

	public static void main(String[] args)
	{
		String s1="hello abc";
		String s2="hello abc";
        System.out.println(s1.length()+"how are you"); // without trim()
        System.out.println(s2.length()+"how are you");  // without trim()
        if(s1.equals(s2))
        {
        	System.out.println(s1.trim()+"how are you");  // with trim()
        }
	}

}
