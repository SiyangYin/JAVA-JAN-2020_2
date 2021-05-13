import java.sql.*;
public class PreparedStatementex 
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
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?)");
		// Update---->"update employee set name=? where id=?"
		// Delete---->"delete from employee where id=?"
		ps.setInt(1, 100);
		ps.setString(2, "KANG CHEN");
        int i=ps.executeUpdate();
        System.out.println(i);
        /*PreparedStatement ps=con.prepareStatement("select * from employee");
         ResultSet rs=st.executeQuery();
        while(rs.next())
        {
        	System.out.println(rs.getString(1)+" "+rs.getString(2));
        }*/
        con.close();
	}

}
