package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\Gecko Driver_new\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://smartretail2:8088/ipgui/");
		driver.manage().window().maximize();
		

	}

}
