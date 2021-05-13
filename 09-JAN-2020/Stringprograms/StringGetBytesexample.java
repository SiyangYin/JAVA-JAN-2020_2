package Stringprograms;

public class StringGetBytesexample
{

	public static void main(String[] args) 
	{
		String s1="aBCDEFGHI";
		byte[] b=s1.getBytes();
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}
