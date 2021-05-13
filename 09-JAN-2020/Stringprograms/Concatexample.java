package Stringprograms;

public class Concatexample 
{
	public static void main(String[] args)
	{
		String s1="www";
		String s2="marlabs";
		String s3="@.com";
		String s8=s1.concat(".").concat(s2).concat(s3);
		System.out.println(s8);
		String s4=s1.concat(" ").concat(s2).concat(" ").concat(s3);
        // Concatenating Space among the Strings
		System.out.println(s4);
		String s5=s1.concat("!!!");
		System.out.println(s5);
		String s6=s1.concat("@").concat(s2);
		System.out.println(s6);
		String s7=s1.concat(".").concat(s2).concat(".").concat(s3);
		System.out.println(s7);
	}

}
