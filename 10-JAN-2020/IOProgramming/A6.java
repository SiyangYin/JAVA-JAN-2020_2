package IOProgramming;
// Example program on writing data into file using character oriented stream 
// and the data should not be overrided.
import java.io.*;
public class A6
{
public static void main(String args[])throws Exception
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the file name");
	String filename=br.readLine();
	FileWriter fw=new FileWriter(filename,true);
    String s="hello welcome to io";
	fw.write(s);
	System.out.println("Data is Successfully writtened with out overriding");
	fw.close();
	br.close();
	}
}

