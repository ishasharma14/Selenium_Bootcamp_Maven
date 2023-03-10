package Test_NG_Annotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_11 {
	
	@BeforeTest
	void m() {
		System.out.println("this is before class");
	}
	
	
	@Test(priority=1)
	public void abc() {
		System.out.println("This abc from test1");
	}
	
	
	@BeforeSuite
	void a() {
		System.out.println("This is before suite");
	}
	
	@AfterSuite
	void b() {
		System.out.println("This is After Suite");
	}

}
