import java.sql.*;
public class DbConnect
{
	static Connection con;
	public static void  connect()  throws Exception
		{
		 Connection con=null;
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nis","root","pswd");
		}
	

}
