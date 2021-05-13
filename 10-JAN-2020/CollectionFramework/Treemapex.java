package CollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class Treemapex 
{

	public static void main(String[] args)
	{
	 Map<String,Integer> tm=new TreeMap<>();
	 tm.put("abc",12);
	 tm.put("abd",13);
	 tm.put("abe",15);
	 tm.put("abf",10);
	 for(String s:tm.keySet())
	 {
		 System.out.println(s+" "+tm.get(s));
	 }
	}

}
