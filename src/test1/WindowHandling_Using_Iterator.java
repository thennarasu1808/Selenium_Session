package test1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling_Using_Iterator {

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
		System.out.println("Title of Parent window: " + driver.getTitle());
		Thread.sleep(2000);

		WebElement openHomePage = driver.findElement(By.id("home"));
		openHomePage.click();

		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		
		String parentWindow = itr.next();
		String childWindow1 = itr.next();
		
		driver.switchTo().window(childWindow1);
		System.out.println("Title of child window: " + driver.getTitle());
		driver.switchTo().window(childWindow1);
		WebElement editBox = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		editBox.click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("Title is: " + driver.getTitle());
	}

}
