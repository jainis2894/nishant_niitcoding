import static org.junit.Assert.*;

import org.junit.Test;


public class TestJUnit2
{
String m="nishant";
MessageUtil mu=new MessageUtil(m);
@Test
public void testSalutationMessage()
{
	System.out.println("Testing Salutation method.............");
	m="Hi!!!"+m;
	assertEquals(m,mu.salutationMessage());
	
}
}
