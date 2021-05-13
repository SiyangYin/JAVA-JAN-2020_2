package Static;

public class Svariable 
{
   static int i=0;
    Svariable()
    {
    	i++;
    	System.out.println(i);
    }
	public static void main(String[] args) 
	{
		Svariable s1=new Svariable();//1
		Svariable s2=new Svariable();//2
		Svariable s3=new Svariable();//3
		Svariable s4=new Svariable();//4
	}

}
