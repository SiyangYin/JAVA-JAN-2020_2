
public class BasicStructure //Identifier (UpperCase or LowerCase)
{
    int a=10;   // Instance Variable
    void f1(int b,int c) // Local Variable
    {
    	// Formal Parameters
    	// System.out.println(a);
    	System.out.println(b);
    	System.out.println(c);
    }
	public static void main(String[] args) 
	{
		BasicStructure marlabs=new BasicStructure(),marlabs1=new BasicStructure(),marlabs2=new BasicStructure();
		// Object Creation or Single Instance
		// marlabs---->Reference Variable
		marlabs.f1(20, 30); // Method Call
		// JVM-----> Main Method
       // Actual or Original Parameters
		System.out.println(marlabs.a);
		marlabs1.a=100;
		System.out.println(marlabs1.a);
		marlabs2.a=1000;
		System.out.println(marlabs2.a);
	}

}
