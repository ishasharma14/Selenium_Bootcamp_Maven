package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
	@Test()
	public void test() {
		int a=10;
		int b=20;
		
		Assert.assertEquals(a,b);
		Assert.assertEquals(a, b, "test is failed");
		Assert.assertTrue(true);
		Assert.fail();
	}

	
}
