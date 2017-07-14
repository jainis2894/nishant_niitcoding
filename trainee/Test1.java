class Test1
{
public static void main(String args[])
{
	String s="ACKNOWLEDGEMENT";
	
	int lt=s.indexOf("K");
	StringBuffer ss=new StringBuffer(s.substring(0,lt+1));
	ss.replace(0,1,"B");
	System.out.println(ss.toString());	
}

}