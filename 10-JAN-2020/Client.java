import java.net.*;
import java.io.*;

public class Client
{
	public static void main(String args[])throws Exception
		{
		Socket s=new Socket("localhost",9974);
		System.out.println("connection is established to server");
		OutputStream os=s.getOutputStream();
		PrintWriter pw=new PrintWriter(os);
		pw.println("Hello Server");
		pw.close();
		s.close();
		}
	}



