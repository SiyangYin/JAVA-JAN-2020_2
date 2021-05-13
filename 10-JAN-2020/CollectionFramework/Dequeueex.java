package CollectionFramework;
import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeueex 
{

	public static void main(String[] args) 
	{
		Deque<Integer> d=new ArrayDeque<>();
		// Doubly Ended Queue
		d.offerFirst(10);
		d.offerLast(90);
		d.offerFirst(60);
		d.offerLast(45);
		for(Integer x:d)
		{
			System.out.println(x);
		}

	}

}
