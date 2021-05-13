package CollectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapex 
{

	public static void main(String[] args) 
	{
		Map<String,Integer> lm=new LinkedHashMap<>();
		lm.put("a", 10);
		lm.put("b", 20);
		lm.put("c", 20);
		lm.put("d", 40);
		for(Map.Entry<String, Integer> e:lm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	} 

}
