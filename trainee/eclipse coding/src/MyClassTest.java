import static org.junit.Assert.*;

import org.junit.Test;


public class MyClassTest 
{
	@Test(expected=IllegalArgumentException.class)
	public void testExceptionIsThrown()
	{
		MyClass c=new MyClass();
		c.multiply(1000, 5);
	}
	@Test
public void testMultiply()
{
		MyClass c=new MyClass();
	assertEquals("the multiplication must return 50",40,c.multiply(10, 5));
}
	@Test 
	public void testAdd()
	{
		MyClass c=new MyClass();
		assertEquals("the addition must return 14",14,c.add(10, 5));
	}
}
