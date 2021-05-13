import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class transactionex {

		public static void main(String[] args)throws ClassNotFoundException,SQLException
		{
			// Loading and Registering the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is Successfully Loaded");
			// Connection Establishment
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs5","root","root");
			System.out.println("Connection is Created Successfully");
			con.setAutoCommit(false);
			// Creation of Statement
			Statement st=con.createStatement();
			st.executeUpdate("insert into user123 values(101,'jingjie',30000)");
			st.executeUpdate("insert into user123 values(102,'shuai wang',30000)");
			con.commit();
			con.close();

	}

}
