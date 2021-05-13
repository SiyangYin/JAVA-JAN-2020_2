package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingusingCollectionsex
{

	public static void main(String[] args)
	{
		List<Integer> l=new ArrayList<>();
		l.add(60);
		l.add(43);
		l.add(41);
		l.add(76);
		l.add(26);
        Collections.sort(l);
        for(Integer x:l)
        {
        	System.out.println(x);
        }
	}

}
