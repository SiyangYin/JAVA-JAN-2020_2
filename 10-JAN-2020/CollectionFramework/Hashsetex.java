package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class Hashsetex 
{

	public static void main(String[] args) 
	{
     Set<String> s=new HashSet<>();
     s.add("abc");
     s.add("abc");
     s.add("abd");
     s.add("abd");
     s.add("dfg");
     s.add("usa");
     System.out.println(s.contains("usa"));
     System.out.println(s.size());
     // System.out.println(s.remove("usb"));
     for(String x:s)
     {
    	 System.out.println(x);
     }

	}

}
