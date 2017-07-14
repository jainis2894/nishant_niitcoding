class NullExcept
{
void fn()
{
System.out.println("hello");

}
public static void main(String args[])
{
	NullExcept n=new NullExcept();
	n=null;
	n.fn();
} 

}