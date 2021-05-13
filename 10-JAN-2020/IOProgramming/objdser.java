package IOProgramming;
// Object Deserialization
import java.io.*;
class student1 implements Serializable
{
int rollno;
student1(int rollno)
	{
	this.rollno=rollno;
	}
void display()
	{
	System.out.println("Rollno:"+rollno);
	}
}
public class objdser
{
public static void main(String args[])throws Exception
	{
	FileInputStream fis=new FileInputStream("D:\\x.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	student1 st=(student1)ois.readObject();
	System.out.println("Object is deserialized");
	st.display();
	ois.close();
	fis.close();
	}
}
