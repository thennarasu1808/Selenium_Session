package test1;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWindow_in_DifferentWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");

		// Using chrome options
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("http://www.leafground.com/");

		// Using 'Maximize()' method
		// driver.manage().window().maximize();

		/*
		 * // Using Dimension
		 * 
		 * Dimension dimension=new Dimension(1378, 736);
		 * driver.manage().window().setSize(dimension);
		 */

	}

}
