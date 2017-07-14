import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class EmployeeDB 
{
static Connection con=null;
static Statement st=null;
 static PreparedStatement pst;

 
 void connectDB() 
	{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nis","root","pswd");
		if(!con.isClosed())
			System.out.println("Successfully connected to server");
			
		else
				System.out.println("connection failed");
		 st=con.createStatement();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
void getEmployee()
	{
	connectDB();
	try
		{
		ResultSet rs=st.executeQuery("select * from Employee");
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+"********"+rs.getString(2)+"************"+rs.getInt(3)+"*************"+rs.getDouble(4));
		}
		}
			catch(Exception e)
				{
				System.out.println(e);
				}
		
	}
	void save()
	{
		int eid[]={8,9,10,11,12,13,14,15};
		int age[]={21,22,23,24,25,43,56,32};
		String name[]={"abc","pqr","xyz","jkl","mno","ege","wer","ghi"};
		double sal[]={23400,324355,656344,564355,35664,343525,325677,131331};
		for(int i=0;i<name.length;i++)
		{
			try{
				
				String s="insert into employee "+"values(?,?,?,?)";
				pst=con.prepareStatement(s);
				pst.setInt(1,eid[i]);
				pst.setString(2, name[i]);
				pst.setInt(3, age[i]);
				pst.setDouble(4, sal[i]);
				pst.executeUpdate();
				System.out.println(" Employee Records Updated Sucessfully");
				}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
	}

public static void main(String[] args) 
		{
			EmployeeDB e= new EmployeeDB();
			e.getEmployee();
			e.save();
			SaveToColl c=new SaveToColl();
			c.addColl();
			c.printFromCol();
			c.topSalary();
			
	
		}
}