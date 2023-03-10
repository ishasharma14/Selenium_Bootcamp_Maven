package Test_NG;

import org.testng.annotations.*;

public class Annotations_2 {
	@BeforeClass
	void login() {
		System.out.println("Login");
	}
	 @Test(priority=1)
     public void search() {
   	  System.out.println("Search");
     }
     @Test(priority=2)
     public void advsearch() {
   	  System.out.println("advance search");
     }
     @AfterClass
     public void logout()
     {
    	 System.out.println("Logout");
     }
     }


    	 
     


