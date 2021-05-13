package CollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetex 
{

	public static void main(String[] args) 
	{
    Set<String> s=new LinkedHashSet<>();
    s.add("abc");
    s.add("abc");
    s.add("abd");
    s.add("abd");
    s.add("dfg");
    s.add("usa");
    System.out.println(s.size());
    System.out.println(s.remove("usa"));
    for(String x:s)
    {
   	 System.out.println(x);
    }

	}

}
