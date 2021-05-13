package HashCode;

public class HashcodeusingString 
{

	public static void main(String[] args) 
	{
		String s1="";
		String s2="hello";
		String s3="hello";
		String s4="Hello";
        String s5=s4;
        if(s3.hashCode()==s4.hashCode())
        {
        	System.out.println("Strings are Same");
        }
        else
        	System.out.println("Strings are not Same");
        System.out.println("Empty String :"+s1.hashCode());
        System.out.println("String 2 is :"+s2.hashCode());
        System.out.println("String 3 is :"+s3.hashCode());
        System.out.println("String 4 is :"+s4.hashCode());
        System.out.println("String 5 is :"+s5.hashCode());
        System.out.println("Hashcode value of Aa"+"Aa".hashCode());
        System.out.println("Hashcode value of BB"+"BB".hashCode());
        // If two Strings with different characters will have the same hash code;
        // This is known as "Collision".
	}
}
