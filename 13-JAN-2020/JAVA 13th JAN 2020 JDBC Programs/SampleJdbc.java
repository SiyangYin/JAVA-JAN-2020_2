import java.sql.*;
public class SampleJdbc
{

	public static void main(String[] args)
	{
		try
		{
			// Loading and Registering the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is Successfully Loaded");
            // Connection Establishment
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs1","root","root");
            System.out.println("Connection is Created Successfully");
            //Closing the Connection
            con.close();
		}
		catch(Exception e)
		{
        	e.getStackTrace();
		}
	}

}
