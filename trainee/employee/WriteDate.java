import java.io.*;
import java.util.*;
public class WriteDate
{
	public WriteDate()
	{
	String ss=new String ("nishant");
	try
	{
		FileOutputStream f=new FileOutputStream("date.ser");
		ObjectOutputStream s=new ObjectOutputStream(f);
		s.writeObject(ss);
		s.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	public static void main(String args[])
	{
		new WriteDate();
	}


}