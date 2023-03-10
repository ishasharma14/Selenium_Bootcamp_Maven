package Test_NG;

import org.testng.annotations.Test;

public class Grouping_test {
	@Test(priority=1, groups= {"sanity", "regression"})
	
		void loginbyEmail() {
			System.out.println("Email");
		}
	
	@Test(priority=2, groups= {"sanity"})
	
	void loginbyFacebook() {
		System.out.println("Facebook");
	}
	
	@Test(priority=3, groups= {"regression"})
	
	void loginbyInsta() {
		System.out.println("Insta");
	}
	
	@Test(priority=4, groups= {"sanity", "regression"})
	
	void loginbyTwitter() {
		System.out.println("Twitter");
	}
}
