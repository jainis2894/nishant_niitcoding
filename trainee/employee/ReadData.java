import java.util.*;
import java.io.*;
class ReadData
{

	public ReadData() throws Exception
	{
		ObjectInputStream fin=new ObjectInputStream(new FileInputStream("date.ser"));
		String s=(String)fin.readObject();
		System.out.println(s);
	}
	public static void main(String args[]) throws Exception
	{
		new ReadData();
	}
	

}