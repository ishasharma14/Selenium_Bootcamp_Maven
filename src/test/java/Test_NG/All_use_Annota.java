package Test_NG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class All_use_Annota {
	@BeforeClass
	void a() {
		System.out.println("Before class");
	}
	@BeforeMethod
    public void login() {
  	  System.out.println("Before Method");
    }
    @Test
    public void search() {
  	  System.out.println("Compulsion");
    }
    @AfterMethod
    public void logout() {
  	  System.out.println("After method");
    }
    
    @BeforeSuite
	void ab() {
		System.out.println("This is before suite");
	}
    
    @AfterClass
    void cc() {
    	System.out.println("After class");
    }
	
	@AfterSuite
	void ba() {
		System.out.println("This is After Suite");
	}

    

}
