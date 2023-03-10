package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Anno_3 {
	@Test(priority=1)
	void openapp()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=2 , dependsOnMethods= {"openapp"})
	void search()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods= {"login","search"})
	void advsearch() {
		
	}

}
