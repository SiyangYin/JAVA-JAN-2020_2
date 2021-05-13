package IOProgramming;
// Object Serialization
import java.io.*;
class student implements Serializable
{
int rollno;
student(int rollno)
	{
	this.rollno=rollno;
	}
void display()
	{
	System.out.println("Rollno:"+rollno);
	}
}
public class objser
{
public static void main(String args[])throws Exception
	{
	FileOutputStream fos=new FileOutputStream("D:\\x.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	student s=new student(101);
	oos.writeObject(s);
	System.out.println("Object is serialized");
	oos.close();
	fos.close();
	}
}
