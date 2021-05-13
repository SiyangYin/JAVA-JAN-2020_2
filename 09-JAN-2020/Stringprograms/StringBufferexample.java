package Stringprograms;

public class StringBufferexample 
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("marlabs");
		int x=sb.length();
		System.out.println("Length of String is :"+x);
		sb.reverse();
		System.out.println(sb);
        sb.insert(5, "for");
        System.out.println(sb);
        sb.insert(0,5);
        System.out.println(sb);
        sb.insert(3, true);
        System.out.println(sb);
        sb.insert(4, 67.32d);
        System.out.println(sb);
        sb.insert(5, 34.89f);
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        sb.deleteCharAt(6);
        System.out.println(sb);
        sb.replace(4, 8, "abcd");
        System.out.println(sb);
        char y[]= {'n','a','n','d','a'};
        sb.insert(2, y);
        System.out.println(sb);

        }
}
