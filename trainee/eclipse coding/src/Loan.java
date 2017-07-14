import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.sql.*;


public class Loan 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nis","root","pswd");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bank id");
		int bid=sc.nextInt();
		 System.out.println("press 1 for  car loan\npress 2 for Home loan \n press 3 for  general loan");
		 int n=sc.nextInt();
		 PreparedStatement st=null;
		 ResultSet rs=null;
		 if(n==1)
		 {
			 String s="car loan"; 
			st= con.prepareStatement("select roi from loan where bid=? and type=?");
			st.setInt(1, bid);
			st.setString(2,s);
			rs=st.executeQuery();
			rs.next();
			  System.out.println("The rate of interest is: "+rs.getDouble(1));
		 }
		 else if(n==2)
		 {
			 String s="car loan"; 
			st= con.prepareStatement("select roi from loan where bid=? and type=?");
			st.setInt(1, bid);
			st.setString(2,s);
			rs=st.executeQuery();
			rs.next();
			  System.out.println("The rate of interest is: "+rs.getDouble(1));
		 }
		 else if(n==3)
		 {
			 String s="car loan"; 
			st= con.prepareStatement("select roi from loan where bid=? and type=?");
			st.setInt(1, bid);
			st.setString(2,s);
			rs=st.executeQuery();
			rs.next();
			  System.out.println("The rate of interest is: "+rs.getDouble(1));
		 }
		 else
		 System.out.println("invalid input");
		
	}
}
