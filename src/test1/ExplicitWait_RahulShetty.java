package test1;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_RahulShetty {
	WebDriverWait wait;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().maximize();

		WebElement demolink=driver.findElement(By.partialLinkText("Click to load get data"));
		demolink.click();
		WebDriverWait wait= new WebDriverWait(driver, 5);
		String result=wait.until(ExpectedConditions.elementToBeClickable(By.id("results"))).getText();
		System.out.println(result);
		
	/*	//Fluent  
		
		
		  Wait<WebDriver> wait1=new
		  FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).
		  pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		  
		  WebElement result1= wait1.until(new Function<WebDriver, WebElement>(){ public
		  WebElement apply(WebDriver driver) { return
		  driver.findElement(By.xpath("results")); } }); */
		 
	}

}
