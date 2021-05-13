package Stringprograms;

import java.util.StringTokenizer;

public class StringTokenizerexample 
{

	public static void main(String[] args) 
	{
		StringTokenizer st=new StringTokenizer("my%name#is%Nagendra","%#");
		// " "---->DELIMETER
        System.out.println(st.countTokens());
        while(st.hasMoreTokens())
        {
        	System.out.println(st.nextToken());
        }
	}

}
