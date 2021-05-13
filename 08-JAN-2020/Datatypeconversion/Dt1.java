package Datatypeconversion;

public class Dt1 
{
   void f1(int a)
   {
	   float b=a;   // Widening (low-->high)
	   System.out.println(b);
   }
   void f2(float i)
   {
	   int j=(int)i;    // Narrowing (high-->low)  Casting Operator
	   System.out.println(j);
   }
	public static void main(String[] args)
	{
		Dt1 dt=new Dt1();
		dt.f1(100);
        dt.f2(500.0f);
	}

}
