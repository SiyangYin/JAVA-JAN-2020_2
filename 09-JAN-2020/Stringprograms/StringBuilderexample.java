package Stringprograms;

public class StringBuilderexample {

	public static void main(String[] args) 
	{
		StringBuilder sbd=new StringBuilder();
		sbd.append("marlabs");
		System.out.println("String is :"+sbd);
		// Create a StringBuilder Object using StringBuilder(CharSequence) constructor
		StringBuilder sbd1=new StringBuilder("ABCDABCDABCD");
        System.out.println("String 1 is :"+sbd1);
        StringBuilder sbd2=new StringBuilder(12);
        System.out.println("String 2 is :"+sbd2.capacity());
        StringBuilder sbd3=new StringBuilder(sbd1);
        System.out.println("String 3 is :"+sbd3.toString());
	}

}
