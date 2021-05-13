package CollectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetex 
{

	public static void main(String[] args) 
	{
		Set<Integer> ts=new TreeSet<>();
		ts.add(25);
		ts.add(30);
		ts.add(45);
		ts.add(90);
		ts.add(-56);
		ts.add(90);
        for(int x:ts)
        {
        	System.out.println(x);
        }
	}

}
