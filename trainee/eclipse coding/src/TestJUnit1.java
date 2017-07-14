import static org.junit.Assert.*;

import org.junit.Test;


public class TestJUnit1 
{
	String m="nishant";
	MessageUtil mu=new MessageUtil(m);
	@Test 
	public void testPrintMessage()
	{
		System.out.println("Tsting print message method.......");
		assertEquals(m,mu.printMessage());
	}
}
