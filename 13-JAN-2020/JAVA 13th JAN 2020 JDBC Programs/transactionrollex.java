import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class transactionrollex
{
	public static void main(String[] args)throws ClassNotFoundException,SQLException, IOException,NumberFormatException
	{
		// Loading and Registering the Driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is Successfully Loaded");
		// Connection Establishment
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs6","root","root");
		System.out.println("Connection is Created Successfully");
		con.setAutoCommit(false);
		// Creation of Prepared Statement
		PreparedStatement ps=con.prepareStatement("insert into emp1234 values(?,?,?)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Entered Id");
			String s1=br.readLine();
			int id=Integer.parseInt(s1);
			System.out.println("Entered Name");
			String name=br.readLine();
			System.out.println("Entered Salary");
			String s3=br.readLine();
			int salary=Integer.parseInt(s3);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			ps.executeUpdate();
			System.out.println("commit/rollback");
			String s4=br.readLine();
			if(s4.equals("commit"))
			{
				con.commit();
			}
			if(s4.equals("rollback"))
			{
				con.rollback();
			}
			System.out.println("Want to Add some more new Records y/n");
			String s5=br.readLine();
			if(s5.equals("n"))
			{
				break;
			}
		}		
			con.commit();
			System.out.println("Records Successfully Saved into the Database");
			con.close();
			
		
	}
}
