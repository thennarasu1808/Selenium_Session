package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestCase {

	@Test(priority=0)

		public void openBrowser() {
	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/");
		
		//driver.get("https://forum.katalon.com/");
		//System.out.println("SampleTestcase Thread Id:- "
				//+ Thread.currentThread().getId());
	
driver.close();
		}

	

	/*
	 * @Test(priority=1) public void secondTestcase() {
	 * System.out.println("This is the secon testcase"); }
	 * 
	 * @Test(priority=2) public void thirdTestcase() {
	 * System.out.println("This is the third testcase"); }
	 * 
	 * @Test(priority=3) public void fourthTestcase() {
	 * System.out.println("This is the fourth testcase"); }
	 */
}
