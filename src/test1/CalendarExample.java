package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Navigated to application url");
		WebElement calendarLnk = driver.findElement(By.xpath("//img[@src='images/calendar-icon.png']"));
		calendarLnk.click();
		System.out.println("Clicked the calendar  link");
		Thread.sleep(2000);
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.click();
		Thread.sleep(3000);
		WebElement dateTen = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		dateTen.click();
		datePicker.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		int i = 0;
		for (i = 0; i < 5; i++) {
			WebElement prevButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Prev']")));
			// WebElement prevButton = driver.findElement(By.xpath("//a[@title='Prev']"));
			prevButton.click();
			Thread.sleep(2000);
		}
		WebElement dateFifteen = driver.findElement(By.xpath("//a[contains(text(),'15')]"));
		dateFifteen.click();

	}

}
