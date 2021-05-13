import java.net.*;
import java.io.*;
public class Server2 
{
	public static void main(String args[])throws Exception
		{
		ServerSocket ss=new ServerSocket(9998);
		System.out.println("serversocket object is created");
		System.out.println("server is ready to interact with client");
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
		OutputStream os=s.getOutputStream();
		PrintStream ps=new PrintStream(os);
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter the message to client"); 
		ps.println(br1.readLine());
		System.out.println("Wait a moment client enters the message");
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		String fromclient=br.readLine();
		System.out.println("FromClient:"+fromclient);
		br1.close();
		br.close();
		ss.close();
		}
	}
