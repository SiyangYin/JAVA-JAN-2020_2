package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Arraylistex {

	public static void main(String[] args) 
	{
		List<String> l=new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
       // l.remove(0);
        System.out.println(l.isEmpty());
        System.out.println(l.size());
        System.out.println(l.get(2));
       //  Object[] obj=l.toArray();
      //  System.out.println(l.toArray());
       for(String x:l)
        {
        	System.out.println(x);
        }
        /*for(Object y:obj)
        {
        	System.out.println(y);
        }*/
	}

}
