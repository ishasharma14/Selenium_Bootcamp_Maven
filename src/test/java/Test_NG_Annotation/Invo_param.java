package Test_NG_Annotation;

import org.testng.annotations.Test;

public class Invo_param {
	
	@Test(invocationCount=10)
	void test() {
		System.out.println("Isha");
	}

}
