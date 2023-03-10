package Test_NG_Annotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tset_22 {
  
	public class test_11 {
		@Test(priority=2)
		public void xyz() {
			System.out.println("This abc from test2");
		}
		
		@AfterTest
		void m2() {
			System.out.println("this is after class");
		}
		
	
	}
}
