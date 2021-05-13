import java.sql.*;
public class SimpleStatementex {

	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{
		// Loading and Registering the Driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is Successfully Loaded");
		// Connection Establishment
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs2","root","root");
		System.out.println("Connection is Created Successfully");
		// Creation of Statement
		Statement st=con.createStatement();
		int i=st.executeUpdate("insert into student(name,pwd)values('marlabs','java')");
		// int i=st.executeUpdate("update student set pwd='marlabs123' where name='marlabs'");
		// int i=st.executeUpdate("delete from student where name='marlabs'");
		// System.out.println(i);
        ResultSet rs=st.executeQuery("select * from student");
        while(rs.next())
        {
        	System.out.println(rs.getString(1)+" "+rs.getString(2));
        }
        // Closing the Connection
        con.close();
	}

}
