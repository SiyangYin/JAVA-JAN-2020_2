package Innerclass;

public class Popcorn 
{
    void taste()
    {
    	System.out.println("Sweety");
    }
	public static void main(String[] args) 
	{
		Popcorn p1=new Popcorn()
				{
			     void taste() 
			     {
			    	 System.out.println("Salty");
			     }
				};
				p1.taste();
		Popcorn p2=new Popcorn();
		p2.taste();
		Popcorn p3=new Popcorn()
				{
			      void taste() 
		          {
		    	 System.out.println("Spicy");
		          }
				};
                p3.taste();
	}

}
