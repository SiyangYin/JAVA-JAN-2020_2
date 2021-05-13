package IOProgramming;
// Example program on reading data from file using byte oriented stream:-
import java.io.*;
public class A3
{
public static void main(String args[])throws Exception
	{
	DataInputStream dis=new DataInputStream(System.in);
	System.out.println("Enter the file name");
	String filename=dis.readLine();
	FileInputStream fis=new FileInputStream(filename);
	int c=fis.read();
	/* read method throws 1 if char is available
	in file else it throws -1*/
    while(c!=-1)
		{
		System.out.print((char)c);
		c=fis.read();
		}
	fis.close();
	}
}
