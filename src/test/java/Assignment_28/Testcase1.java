package Assignment_28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Testcase1 {
	WebDriver driver;
	@BeforeClass
	public void launch() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=1)
	void verifyurl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
	
	@Test(priority=2)
	void createacc() {
		driver.findElement(By.linkText("Create new account")).click();
		
	}
	
	@Test(priority=3)
	void values() {
		driver.findElement(By.xpath("//input[@id='u_c_b_YO']")).sendKeys("isha");
		driver.findElement(By.xpath("//input[@id='u_h_d_j8']")).sendKeys("sharma");
		
	}
	 
	
	//@AfterClass
	void close() {
		driver.close();
	}

}
