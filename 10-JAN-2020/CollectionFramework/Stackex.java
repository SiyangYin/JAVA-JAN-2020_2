package CollectionFramework;

import java.util.Stack;

public class Stackex
{

	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        // s.pop();
        System.out.println(s.peek());
        System.out.println(s.size());
        for(int x:s)
        {
        	System.out.println(x);
        }
	}

}
