package test1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Navigated to application url");
		WebElement windowsBtn = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[11]/a/img"));
		windowsBtn.click();
		System.out.println("Clicked the Windows Button");
		Thread.sleep(2000);

		// Get the old window
		String OldWindow = driver.getWindowHandle();

		WebElement openHomePage = driver.findElement(By.id("home"));
		openHomePage.click();

		Set<String> handles = driver.getWindowHandles();

		for (String newWindow : handles) {
			if (!OldWindow.equalsIgnoreCase(newWindow)) {
				driver.switchTo().window(newWindow);

			}
		}
		WebElement editBox = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		editBox.click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(OldWindow);
		System.out.println("Switched to old window");

		WebElement openMulWindows = driver
				.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		openMulWindows.click();
		System.out.println("Clicked on Multiple windows button");
		int windowSize = driver.getWindowHandles().size();
		System.out.println("No of windows opened: " + windowSize);

		WebElement dontCloseMe = driver.findElement(By.xpath("//*[@id=\"color\"]"));
		dontCloseMe.click();
		System.out.println("Clicked on Dont Close Me button");
		Set<String> newWindows = driver.getWindowHandles();

		for (String allWindows : newWindows) {
			if (!allWindows.equalsIgnoreCase(OldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}

		}
	}

}
