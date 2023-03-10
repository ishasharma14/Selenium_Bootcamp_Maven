package Pom_demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_test {

	public static void main(String[] args) {
		WebDriver driver;
		//launch browser
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Login_page lp = new Login_page(driver);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		lp.logocheck();
		lp.setusername("Admin");
		lp.setpasswd("admin123");
		lp.clickbtn();
	}

}
