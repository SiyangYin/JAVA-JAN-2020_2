package IOProgramming;
// Example program on reading data from key board using character oriented stream:-
import java.io.*;
public class A2
{
public static void main(String args[])throws Exception
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	/* InputStreamReader it converts byte oriented
	message to charater oriented message*/
	System.out.println("Enter the name");
	String i=br.readLine();
	System.out.println("Enter the Rollno");
	int j=Integer.parseInt(br.readLine());
	System.out.println("Enter the city name");
	String k=br.readLine();
	System.out.println("Details You Entered are..........");
	System.out.println("YourName is:"+i);
	System.out.println("YourId is:"+j);
	System.out.println("YourCity is:"+k);
	br.close();
	}
}
