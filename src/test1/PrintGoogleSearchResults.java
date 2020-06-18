package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintGoogleSearchResults {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("matrix");
		Thread.sleep(5000);

		List<WebElement> searchGoogle = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		for (WebElement googleSearchResult : searchGoogle) {
			String list = googleSearchResult.getText();
			System.out.println(list);

			// if want to click a search using a keyword, follow the steps
			if (list.contains("shampoo")) {
				googleSearchResult.click();
				break;

				// if want to select a search using position
				/*
				 * int position=0; for (WebElement googleSearchResult : searchGoogle) { String
				 * list = googleSearchResult.getText(); System.out.println(list); position ++;
				 * 
				 * if(position=3) { googleSearchResult.click(); break; }
				 */
			}
		}
	}

}
