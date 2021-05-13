package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Hashmapex 
{

	public static void main(String[] args) 
	{
		Map<String,Integer> map=new HashMap<>();
		// HashMap is not Synchronized
		map.put("AB", 10);
		map.put("AE", 10);
		map.put("AC", 30);
		map.put("AD", 40);
		System.out.println(map.get("AC"));
        
	}

}
