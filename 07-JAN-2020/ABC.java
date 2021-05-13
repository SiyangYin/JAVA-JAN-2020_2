
public class ABC 
{
    int i=100;
    void f1(int j)
    {
    	System.out.println(j);
    }
	public static void main(String[] args)
	{
		ABC a=new ABC(),a1=new ABC(),a2=new ABC(),a3=new ABC();
		a.f1(200);
        System.out.println(a.i);
        a1.i=1000;
        System.out.println(a1.i);
        a2.i=2000;
        System.out.println(a2.i);
        a3.i=3000;
        System.out.println(a3.i);
	}

}
