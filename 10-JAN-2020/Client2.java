import java.net.*;
import java.io.*;
public class Client2 
{
	public static void main(String args[])throws Exception
		{
		Socket s=new Socket("localhost",9998);
		System.out.println("connection is established to server");
		OutputStream os=s.getOutputStream();
		InputStream is=s.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the message to server");
		PrintWriter pw=new PrintWriter(os);
		pw.println(br1.readLine());
		System.out.println("FromServer:"+br.readLine());
		pw.close();
		br1.close();
		br.close();
		s.close();
		}
}
