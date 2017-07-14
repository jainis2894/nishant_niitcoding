import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class MySqlJava
{
public static void main(String args[])
{
	Configuration c=new Configuration();
	c.configure("hibernate.cfg.xml");
	SessionFactory factory=c.buildSessionFactory();
	Session s=factory.openSession();
	Employee e=new Employee();
	e.setId(123);
	e.setName("nishant");
	e.setAge(34);
	e.setSal(434);
	Transaction t=s.beginTransaction();
	s.save(e);
	System.out.println("object saved successfully");
	t.commit();
	s.close();
	factory.close();
	
}
}
