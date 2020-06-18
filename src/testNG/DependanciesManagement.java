package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {

	@Test(priority=0)
	public void highSchool() {
		System.out.println("High School");

	}

	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("Higher secondary School");
	}

	@Test()
	public void college() {
		System.out.println("college");
	}

}
