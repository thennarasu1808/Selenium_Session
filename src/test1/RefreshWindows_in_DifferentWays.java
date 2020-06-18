package test1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RefreshWindows_in_DifferentWays {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		
		ChromeOptions chromeOptions =new ChromeOptions();
		chromeOptions.addArguments("--Start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		
		// using navigate method
		//driver.navigate().refresh();
		
		//using get method
	//	driver.get(driver.getCurrentUrl());
		
		//using javascript executor
		
		JavascriptExecutor executor=(JavascriptExecutor) driver;
	//	executor.executeScript("location.reload()"); // or
		executor.executeScript("history.go(0)");
		
		//Using robot class
		Robot robot = new Robot();
		robot .keyPress(KeyEvent.VK_F5);
		robot .keyRelease(KeyEvent.VK_F5);
	}

}
