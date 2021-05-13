import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Resultsetmetadataex 
{
	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{
		// Loading and Registering the Driver 
        Class.forName("com.mysql.cj.jdbc.Driver");
	    System.out.println("Driver is Successfully Loaded");
		// Connection Establishment
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs3","root","root");
		System.out.println("Connection is Created Successfully");
		// Creation of Prepared Statement
		PreparedStatement ps=con.prepareStatement("select * from employee");
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rsmd=rs.getMetaData();
		System.out.println("Total Columns Count :"+rsmd.getColumnCount());
		System.out.println("Column Name of 2nd Column :"+rsmd.getColumnName(2));
		System.out.println("Column Type of 2nd Column :"+rsmd.getColumnTypeName(2));
		con.close();
	}
}
