package operator;
/*Java Ternary operator is used as one liner replacement for if-then-else statement
and used a lot in java programming. 
it is the only conditional operator which takes three operands.*/
public class TernaryOperator 
{
	public static void main(String args[])
	{  
		int a=2;  
		int b=5;  
		int c=(a<b)?a:b;  // Min
		int d=(a>b)?a:b;  // Max
		System.out.println(c);  
		System.out.println(d);
    }
}  
