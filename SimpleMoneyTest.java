import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.text.DecimalFormat;

/**
*This method helps in testing SimpleMoney.
 */


public class SimpleMoneyTest {
/*
This class is used to test all the methods that have been written in SimpleMoney java class
 */
  public SimpleMoney sm;

  @Before
  public void setUp() throws Exception {
    sm = new SimpleMoney(20,14);
  }

  @Test
  public void getDecimalValue() {
    assertEquals(sm.getDecimalValue(),20.14,0.01);
  }

}