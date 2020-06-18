package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFromPropertyFile {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\tkarunakaran\\eclipse-workspace\\Test\\Config\\config.properties");
		prop.load(fis);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}else  if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Gecko_Firefox\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		
driver.get(prop.getProperty("url"));
	}

}
