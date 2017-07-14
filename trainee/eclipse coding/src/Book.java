import java.util.*;
public class Book {
	public static void main(String args[])
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1000, "nishant");
		m.put(10001, "manu");
		m.put(1005, "tanu");
		m.put(1007,"jkl");
		System.out.println(m.containsKey(1004));
		System.out.println(m.remove(1007));
		
	}

}
