package CollectionFramework;

import java.util.List;
import java.util.Vector;

public class Vectorex 
{

	public static void main(String[] args) 
	{
		
	List<Integer> v=new Vector<>(10,5);
    v.add(10);
    v.add(20);
    v.add(30);
    v.add(40);
    v.add(50);
   //  v.remove(2);
    System.out.println(v.size());
    System.out.println(v.get(2));
    for(int x:v)
    {
    	System.out.println(x);
    }
	}
}

