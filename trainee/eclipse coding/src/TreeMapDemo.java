import java.util.Map;
import java.util.TreeMap;


public class TreeMapDemo 
{	
public static void main(String args[])
{
	TreeMap<String,String> t=new TreeMap<String,String>();
	t.put("101","manu");
	t.put("105", "tanu");
	t.put("100", "sonu");
	t.put("109","sanu");
	for(Map.Entry m:t.entrySet())
	{
		System.out.println(m.getKey()+"  "+m.getValue());
	}
}
}
