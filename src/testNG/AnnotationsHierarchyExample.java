package testNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsHierarchyExample {
	@Test
	public void test1() {
		System.out.println("I am Test");
	}

	@Test
	public void test2() {
		System.out.println("I am Test2");
	
	}
	@Test
	public void test3() {
		System.out.println("I am Test3");
	}


	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am after class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am before  suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am after  suite");
	}

}
