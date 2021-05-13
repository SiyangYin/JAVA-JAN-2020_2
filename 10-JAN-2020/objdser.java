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
class objdser
{
public static void main(String args[])throws Exception
	{
	FileInputStream fis=new FileInputStream("abc.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	student st=(student)ois.readObject();
	System.out.println("Object is deserialized");
	st.display();
	ois.close();
	fis.close();
	}
}
