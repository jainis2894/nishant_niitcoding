 import java.util.*;
import java.io.*;
class Impl
{
 static ArrayList<Employee> li;


public void saveToFile()
{
	try{
	ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("a.txt"));
	out.writeObject(li);
	System.out.println("The employee list is saved in the file" );
	ObjectInputStream in=new ObjectInputStream(new FileInputStream("a.txt"));
	ArrayList<Employee> temp=(ArrayList<Employee>) in.readObject();
	System.out.println("The retrived Employees object from file are");
	for(int i=0;i<temp.size();i++)
	{
		System.out.println(temp.get(i).getName()+"***********"+temp.get(i).getAge()+"***********"+temp.get(i).getSalary());
	}	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}		
}


public void addEmployee()
{ 

Employee e1=new Employee();
e1.setName("Ravi");
e1.setAge(21);
e1.setSalary(25000);
Employee e2=new Employee();
e2.setName("Kavi");
e2.setAge(23);
e2.setSalary(225000);
Employee e3=new Employee();
e3.setName("Navi");
e3.setAge(22);
e3.setSalary(65000);
Employee e4=new Employee();
e4.setName("Lavi");
e4.setAge(28);
e4.setSalary(225000);
Employee e5=new Employee();
e5.setName("Tavi");
e5.setAge(26);
e5.setSalary(256000);
li=new ArrayList<Employee>();
li.add(e1);
li.add(e2);
li.add(e3);
li.add(e4);
li.add(e5);

}
 





public void getAllsal()
{
for(int i=0;i<li.size();i++)
{
System.out.println(li.get(i).getSalary());

}
}
public void getAllName()
{
for(int i=0;i<li.size();i++)
{
System.out.println(li.get(i).getName());
}
}
public void getAllAge()
{

for(int i=0;i<li.size();i++)
{
System.out.println(li.get(i).getAge());
}
}



public static void sortEmpList()

{

	for(int i=0;i<li.size();i++)
	{

		for(int j=i+1;j<li.size();j++)
		{
			Employee e=null;
			if(li.get(i).getSalary()>li.get(j).getSalary())
			{	
				e=li.get(i);
				li.set(i,li.get(j));
				li.set(j,e);
				
				
			}
		}
	}

}

public void printSortedArray()
{
	for(int i=0;i<li.size();i++)
	{
		System.out.println(li.get(i).getName()+"---------------"+li.get(i).getAge()+"---------------"+li.get(i).getSalary());		
	
	}

}

public static void main(String args[])
{
Impl i=new Impl();
i.addEmployee();
//i.addEmployeeInList();
System.out.println("All employee name");
i.getAllName();
System.out.println("All employee salary");
i.getAllsal();
System.out.println("All employee Age");
i.getAllAge();

//Collections.sort(li);
System.out.println("The sorted  order is ");
/*for(int ii=0;ii<li.size();ii++)
{
System.out.println(li.get(ii).getName());
System.out.println(li.get(ii).getAge());
System.out.println(li.get(ii).getSalary());
*/
i.sortEmpList();
i.printSortedArray();
System.out.println("THe sorted list by using comparator  and sorting the names");
Collections.sort(li,new sortByName());
for(Employee e: li){  
System.out.println(e.getName()+" "+e.getAge()+" "+e.getSalary());

  
}
i.saveToFile();

}

}