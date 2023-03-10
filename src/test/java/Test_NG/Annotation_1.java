package Test_NG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_1 {
      @BeforeMethod
      public void login() {
    	  System.out.println("Login");
      }
      @Test(priority=1)
      public void search() {
    	  System.out.println("Login");
      }
      @Test(priority=2)
      public void advsearch() {
    	  System.out.println("advance search");
      }
      @AfterMethod
      public void logout() {
    	  System.out.println("Logout");
      }
      
             
}
