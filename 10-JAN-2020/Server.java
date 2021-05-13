import java.net.*;
import java.io.*;
public class Server 
{
	public static void main(String args[])throws Exception
		{
		ServerSocket ss=new ServerSocket(9974);
		System.out.println("serversocket object is created");
		System.out.println("server is ready to interact with client");
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		String x=br.readLine();
		System.out.println("FromClient: "+x);
		br.close();
		ss.close();
		}
	}
