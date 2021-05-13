package CollectionFramework;

import java.io.FileOutputStream;
import java.util.Properties;

public class Propertiesex 
{

	public static void main(String[] args)throws Exception
	{
     FileOutputStream fos=new FileOutputStream("D:\\marlabs.properties");
     System.out.println("File is created");
     Properties p=new Properties();
     p.put("username", "NewJersey");
     p.put("password", "USA");
     p.store(fos, "Details of City is :");
     System.out.println("Details are successfully stored into the File");
     fos.close();
	}

}
