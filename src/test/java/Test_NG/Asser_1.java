package Test_NG;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asser_1 {
	@Test
  public void abc() {
	  int a=10;
	  int b=25;
	  
	  Assert.assertEquals(a,b); //pass
	  Assert.assertTrue(true);
	  
  }
}
