package Datatypeconversion;
public class Wrapperex 
{
    void f1(String a)
    {
    	// int b=Integer.parseInt(a);
    	float b=Float.parseFloat(a);
    	System.out.println(b);
    }
	public static void main(String[] args) 
    {
		Wrapperex w=new Wrapperex();
		w.f1("10");

	}

}
