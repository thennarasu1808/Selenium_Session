package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	@Test
	@Parameters("myName")
	public void prinName(String name) {
		
		System.out.println("My name is  "+name);
	}

}
