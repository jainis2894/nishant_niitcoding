import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection 
{
private Connection con;
void getDbConnection() throws ClassNotFoundException, SQLException
{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nis","root","pswd");
}
int executeQuery(String query) throws SQLException
{
	
	return con.createStatement().executeUpdate(query);
	
}
}
