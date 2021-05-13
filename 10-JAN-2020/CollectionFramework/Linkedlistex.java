package CollectionFramework;
import java.util.LinkedList;
import java.util.List;
public class Linkedlistex 
{

	public static void main(String[] args) 
	{
		List<String> l=new LinkedList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
       //  l.remove(2);
        System.out.println(l.isEmpty());
        System.out.println(l.size());
        System.out.println(l.get(2));
        for(String x:l)
        {
        	System.out.println(x);
        }

	}

}
