package Pom_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	//pom class
	//without page factory approach
	
	WebDriver driver;
	Login_page(WebDriver driver){
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	//locators
	By img_logo = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img");
	By password = By.xpath("//input[@placeholder='Password']");
	By username = By.xpath("//input[@placeholder='Username']");
	By click = By.xpath("//button[@type='submit']");
	
	
	//Actions
	public void setusername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void setpasswd(String pswd) {
		driver.findElement(password).sendKeys(pswd);
	}
	
	public void logocheck() {
		boolean ch=driver.findElement(img_logo).isDisplayed();
		System.out.println(ch);
	}
	
	public void clickbtn() {
		driver.findElement(click).click();
	}
	
}
