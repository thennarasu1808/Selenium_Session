package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long startTime;
	long endTime;

	@BeforeSuite
	public void openBrowser() {
		startTime = System.currentTimeMillis(); // Start time before execution
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@BeforeMethod
	
	public void beforeMethod() {

		System.out.println("I am before method, i always run before each test case");
	}
	
	@AfterMethod
	
	public void afterMethod() {

		System.out.println("I am after method, i always run after each test case");
	}

	@Test
	public void openGoogle() {

		driver.get("http://www.google.com");
		
		System.out.println("google Thread Id:- "
				+ Thread.currentThread().getId());
		
	}

	@Test
	public void openBing() {

		driver.get("http://www.bing.con");
		
		/*
		 * String actual= driver.findElement(By.id("b_logo")).getText(); String
		 * expected="bin"; if(actual.equalsIgnoreCase(expected)){
		 * System.out.println("Passed"); }
		 */
		System.out.println("bing Thread Id:- "
				+ Thread.currentThread().getId());
	}

	/*
	 * @Test public void openYahoo() {
	 * 
	 * driver.get("http://www.yahoo.com"); System.out.println("yahoo Thread Id:- " +
	 * Thread.currentThread().getId()); }
	 */

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime = System.currentTimeMillis(); // Start time before execution
		long totalTime = startTime + endTime;
		System.out.println("Total Time: " + totalTime);
	}
}
