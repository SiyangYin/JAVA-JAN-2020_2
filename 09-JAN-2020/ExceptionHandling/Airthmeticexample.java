package ExceptionHandling;

public class Airthmeticexample {

	public static void main(String[] args) 
	{
	 try
	 {
		 int a=100;
		 int b=10;
		 int result=a/b;
		 System.out.println("Result is :"+result);
	 }
	 catch(ArithmeticException ae)
	 {
		 System.out.println("DividebyZero Exception");
	 }
     catch(Exception e)
	 {
    	 e.getMessage();
	 }
	 finally
	 {
		 System.out.println("Finally Block");
	 }
	}

}
