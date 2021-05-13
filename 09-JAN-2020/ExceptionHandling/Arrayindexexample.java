package ExceptionHandling;

import java.util.Scanner;

public class Arrayindexexample 
{

	public static void main(String[] args) 
	{
		try
		{
			int[] a=new int[3];
			Scanner sc=new Scanner(System.in);
			a[0]=sc.nextInt();
			a[1]=sc.nextInt();
			a[2]=sc.nextInt();
		// 	a[3]=sc.nextInt();
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			// System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Give Values accordingly");
		}
		catch(Exception e1)
		{
			e1.getMessage();
		}
		finally
		{
			System.out.println("In Finally Block");
		}
	}

}
