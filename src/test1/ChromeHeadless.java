package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadless {

	public static void main(String[] args) {
	
		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		//or we can use the below code also
		
		options.addArguments("--headless");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(options);
			driver.get("http://www.google.com");
			System.out.println("The page title is : " +driver.getTitle());
	}

}
