package IOProgramming;
// Example program on reading data from keyboard using byte oriented stream:-
import java.io.*;
class A1
{
int result;
void f1(int a,int b)
	{
	result=a+b;
	System.out.println("Sumis:"+result);
	}
}
public class B1 
{
public static void main(String args[])throws Exception
	{
	DataInputStream dis=new DataInputStream(System.in);
	/* System.in its captures data from keyboard
	and sent to datainputstream object.*/
	System.out.println("Enter a's value");
	String x=dis.readLine();
	int i=Integer.parseInt(x);
	System.out.println("Enter b's value");
	String y=dis.readLine();
	int j=Integer.parseInt(y);
	A1 ob=new A1();
	ob.f1(i,j);
    dis.close();
	}
}

