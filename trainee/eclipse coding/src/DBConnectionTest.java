import java.sql.Connection;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class DBConnectionTest
{
@InjectMocks private DBConnection db;
@Mock private Connection mockcon;
@Mock private Statement mockstat;
@Before
public void setup()
{
	MockitoAnnotations.initMocks(this);
}
@Test
public void checkDbConnection()throws Exception 
{
	Mockito.when(mockcon.createStatement()).thenReturn(mockstat);
	Mockito.when(mockcon.createStatement().executeUpdate(Mockito.any())).thenReturn(1);
	int value=db.executeQuery("");
	Assert.assertEquals(value, 1);
}
}
