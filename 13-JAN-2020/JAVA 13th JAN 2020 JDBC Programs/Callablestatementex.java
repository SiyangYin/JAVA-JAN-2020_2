import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Callablestatementex {

	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{
		// Loading and Registering the Driver 
        Class.forName("com.mysql.cj.jdbc.Driver");
	    System.out.println("Driver is Successfully Loaded");
		// Connection Establishment
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs4","root","root");
		System.out.println("Connection is Created Successfully");
		// Creation of Callable Statement
		CallableStatement st=con.prepareCall("{call insertN(?,?)}");
		st.setInt(1, 109);
		st.setString(2, "Song");
		st.execute();
		System.out.println("Success");
        con.close();
	}
}
