package Test_NG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver= new ChromeDriver();
  @Test(priority=1)
  public void openapp()
  {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  @Test(priority=2)
  public void login() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.findElement(By.xpath("//input[@placeholder='用户名']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='密码']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @Test(priority=3)
  public void closeapp() 
  {
	  driver.close();
  }
  
}
