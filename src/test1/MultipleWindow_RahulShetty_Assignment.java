package test1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow_RahulShetty_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement mulWindowsLink = driver.findElement(By.linkText("Multiple Windows"));
		mulWindowsLink.click();
		Thread.sleep(2000);
		WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
		clickHereLink.click();

		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> itr = allWindow.iterator();
		String parentWndow = itr.next();
		String childWndow = itr.next();

		driver.switchTo().window(childWndow);
		WebElement newWindowText = driver.findElement(By.xpath("//div[@class='example']/h3"));
		String childWindowText = newWindowText.getText();
		System.out.println("Text of child Window: " + childWindowText);
		driver.close();

		driver.switchTo().window(parentWndow);
		WebElement parentWindowText = driver.findElement(By.xpath("//div[@class='example']/h3"));
		String OpeningWindowText = parentWindowText.getText();
		System.out.println("Text of parent Window: " + OpeningWindowText);
	}

}
