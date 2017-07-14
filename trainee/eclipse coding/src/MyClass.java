
public class MyClass 
{
	public int multiply(int a,int b)
	{
		if(a>999)
			throw new IllegalArgumentException("A should be less than 1000");
		return a*b;
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	public int subtract(int a,int b)
	{
		return a-b;
	}

}
