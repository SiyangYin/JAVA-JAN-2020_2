import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batchupdatesex {

	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{
		// Loading and Registering the Driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is Successfully Loaded");
		// Connection Establishment
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs6","root","root");
		System.out.println("Connection is Created Successfully");
		con.setAutoCommit(false);
		Statement st=con.createStatement();
		st.addBatch("insert into emp1234 values(28,'akshitha',76000)");
		st.addBatch("insert into emp1234 values(29,'nanda',98000)");
		st.executeBatch();
		con.commit();
		con.close();
	}
}
