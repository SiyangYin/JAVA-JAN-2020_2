package IOProgramming;
// Example program on writing data into file using byte oriented stream:-
import java.io.*;
public class A5
{
public static void main(String args[])throws Exception
	{
	DataInputStream dis=new DataInputStream(System.in);
	System.out.println("Enter the fileName");
    String filename=dis.readLine();
	FileOutputStream fos=new FileOutputStream(filename);
	String s="Hello Welcome to Marlabs";
	/* convert this string format into byte 
	format by calling the getBytes method
	on the string reference*/
	byte b[]=s.getBytes();
	/* By calling getBytes() on the String reference
	it converts the string into byte value and returns
	in array form*/
	fos.write(b);
	System.out.println("Data is Writtened successfully");
    fos.close();
	dis.close();
	}
}
