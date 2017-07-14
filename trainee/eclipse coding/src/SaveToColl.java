import java.sql.ResultSet;
import java.util.ArrayList;


public class SaveToColl 
{
	static ArrayList<Employee> elist;
	void addColl()
	{
		elist=new ArrayList<Employee>();
		EmployeeDB db=new EmployeeDB();
		try{
		db.connectDB();
		ResultSet r=EmployeeDB.st.executeQuery("select* from employee");
		int temp=0;
		Employee e=null;
		while(r.next())
		{
			e=new Employee();
			e.setId(r.getInt(1));
			e.setName(r.getString(2));
			e.setAge(r.getInt(3));
			e.setSalary(r.getDouble(4));
			elist.add(e);
		}
		System.out.println("The Employee data is saved into collection..............");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	void printFromCol()
	{
		System.out.println("Printing Employee data from collection......................");
		for(int i=0;i<elist.size();i++)
		{
			System.out.println("Employee ID-----"+elist.get(i).getId()+"Employee Name------"+elist.get(i).getName()+"Employee Age--------"+elist.get(i).getAge()+"Employee salary------"+elist.get(i).getSalary());
		}
	}
	
	 void topSalary()
	 {
		 System.out.println("The top 5 employee interms  of salary...........");
		 try{
		ResultSet rs= EmployeeDB.st.executeQuery("select eid,ename,age,sal from employee order by sal desc limit 5");
		while(rs.next())
		{
			System.out.println("Employee Id-->"+rs.getInt(1)+"Emloyee Name-->"+rs.getString(2)+"Employee AGe-->"+rs.getInt(3)+"Employee Salary-->"+rs.getDouble(4));
		}
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 }

}
