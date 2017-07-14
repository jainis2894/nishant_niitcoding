import java.util.*;
import java.text.*; 
class DateDemo
{

	public static void main(String args[])
	{
		Date d=new Date ();
		SimpleDateFormat s=new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(s.format(d));
		
	}

}