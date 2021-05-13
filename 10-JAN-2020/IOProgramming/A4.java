package IOProgramming;
// Example program on reading data from file using character oriented stream:-
import java.io.*;
public class A4
{
public static void main(String args[])throws Exception
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the file name");
	String filename=br.readLine();
	FileReader fr=new FileReader(filename);
	int c=fr.read();
	/* read method throws 1 if char is available
	in file else it throws -1*/
	System.out.println("File contents are........");
    while(c!=-1)
		{
		System.out.print((char)c);
		c=fr.read();
		}
	fr.close();
	br.close();
	}
}
