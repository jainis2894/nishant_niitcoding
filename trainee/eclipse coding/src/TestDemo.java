import static org.junit.Assert.*;

import org.junit.Test;


public class TestDemo 
{
@Test
public void testX()
{
	Demo d=new Demo();
	assertEquals("x is 10",d.check(10)); 
	assertEquals("x is 20",d.check(20));
	assertEquals("50-100",d.check(60));
	assertEquals("I am more than 100",d.check(149));
	}
}
